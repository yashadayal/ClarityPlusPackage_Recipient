package com.ClarityPlusPackage.RecipientMService.Service.Implementation;

import com.ClarityPlusPackage.RecipientMService.DTO.RecipientDetailsDTO;
import com.ClarityPlusPackage.RecipientMService.Entity.RecipientDetails;
import com.ClarityPlusPackage.RecipientMService.Repository.RecipientDetailsRepo;
import com.ClarityPlusPackage.RecipientMService.Service.RecipientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class RecipientDetailsImpl implements RecipientDetailsService {

    @Autowired
    EmailConfig emailConfig;

    @Autowired
    RecipientDetailsRepo recipientDetailsRepo;


    public String getEmailIDByInstituteID(String instituteID) {
        System.out.println("Inside Implementation");
        //String emailID = idToEmailIDRepo.findEmailIDByInstituteID(instituteID);
        String emailID = "yasha.dayal145@gmail.com";
        sendMail(emailID);
        return "OTP to sent linked emailID successfully!";
    }

    public void sendMail(String emailID)  {
        String subject = "OTP for Delivering package";
        Random random = new Random();
        int otp = random.nextInt(1000);
        String text = "Your OTP is" + otp;
        emailConfig.sendOTPMail(emailID,subject,text);
        System.out.println("Outside Implementation");
    }


    @Override
    public List<String> searchByInstituteID(String instituteID) {
        System.out.println("Inside Impl");
        List<String> recipientDetailsList = this.recipientDetailsRepo.findRecipientDetailsByInstituteId(instituteID);
        System.out.println("Outside Impl");
        return recipientDetailsList;
    }

    @Override
    public List<String> searchLogsByInstituteID(String instituteID) {
        System.out.println("Inside Impl");
        List<String> recipientDetailsList = this.recipientDetailsRepo.findAllRecipientDetailsByInstituteId(instituteID);
        System.out.println("Outside Impl");
        return recipientDetailsList;
    }

    @Override
    public String saveData(RecipientDetailsDTO recipientDetailsDTO) {
        System.out.println("Inside savedata");
        RecipientDetails recipientDetails = mapRecipientDetailsDTOToEntity(recipientDetailsDTO);
        this.recipientDetailsRepo.save(recipientDetails);
        System.out.println("Outside savedata");
        return "Order details saved successfully!";
    }

    private RecipientDetails mapRecipientDetailsDTOToEntity(RecipientDetailsDTO recipientDetailsDTO) {
        RecipientDetails recipientDetails = new RecipientDetails();
        recipientDetails.setOrderID(recipientDetailsDTO.getOrderID());
        recipientDetails.setInstituteID(recipientDetailsDTO.getInstituteID());
        recipientDetails.setRecipientFirstName(recipientDetailsDTO.getRecipientFirstName());
        recipientDetails.setRecipientLastName(recipientDetailsDTO.getRecipientLastName());
        recipientDetails.setRecipientPhoneNumber(recipientDetailsDTO.getRecipientPhoneNumber());
        recipientDetails.setRetailer(recipientDetailsDTO.getRetailer());
        recipientDetails.setReceived(false);
        return recipientDetails;
    }


}
