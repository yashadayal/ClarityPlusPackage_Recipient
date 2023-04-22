package com.ClarityPlusPackage.RecipientMService.Service.Implementation;

import com.ClarityPlusPackage.RecipientMService.DTO.RecipientDetailsDTO;
import com.ClarityPlusPackage.RecipientMService.Entity.RecipientDetails;
import com.ClarityPlusPackage.RecipientMService.Repository.RecipientDetailsRepo;
import com.ClarityPlusPackage.RecipientMService.Service.RecipientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipientDetailsImpl implements RecipientDetailsService {

    @Autowired
    RecipientDetailsRepo recipientDetailsRepo;

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
        return "Success";
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
