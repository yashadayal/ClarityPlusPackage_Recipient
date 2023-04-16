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
    public List<RecipientDetails> searchByInstituteId(String InstituteId) {
        List<RecipientDetails> recipientDetailsList = this.recipientDetailsRepo.findRecipientDetailsByInstituteId(InstituteId);
        return recipientDetailsList;
    }


}
