package com.ClarityPlusPackage.RecipientMService.Repository;

import com.ClarityPlusPackage.RecipientMService.Entity.RecipientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipientDetailsRepo extends JpaRepository<RecipientDetails, String > {

    @Query("FROM RecipientDetails p WHERE p.InstituteID =: InstituteId")
    List<RecipientDetails> findRecipientDetailsByInstituteId(String InstituteId);
}
