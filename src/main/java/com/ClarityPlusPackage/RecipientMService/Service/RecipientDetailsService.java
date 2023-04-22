package com.ClarityPlusPackage.RecipientMService.Service;

import com.ClarityPlusPackage.RecipientMService.DTO.RecipientDetailsDTO;
import com.ClarityPlusPackage.RecipientMService.Entity.RecipientDetails;

import java.util.List;

public interface RecipientDetailsService {
    List<String> searchByInstituteID(String InstituteId);

    List<String> searchLogsByInstituteID(String instituteID);

    String saveData(RecipientDetailsDTO recipientDetailsDTO);
}
