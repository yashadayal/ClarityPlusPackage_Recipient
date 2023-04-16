package com.ClarityPlusPackage.RecipientMService.Service;

import com.ClarityPlusPackage.RecipientMService.Entity.RecipientDetails;

import java.util.List;

public interface RecipientDetailsService {
    List<RecipientDetails> searchByInstituteID(String InstituteId);
}
