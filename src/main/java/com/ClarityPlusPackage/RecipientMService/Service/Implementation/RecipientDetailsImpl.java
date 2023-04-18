package com.ClarityPlusPackage.RecipientMService.Service.Implementation;

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


}
