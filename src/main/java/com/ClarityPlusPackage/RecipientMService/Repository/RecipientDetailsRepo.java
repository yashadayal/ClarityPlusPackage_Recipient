package com.ClarityPlusPackage.RecipientMService.Repository;

import com.ClarityPlusPackage.RecipientMService.Entity.RecipientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipientDetailsRepo extends JpaRepository<RecipientDetails, String > {

    @Query("SELECT p.OrderID FROM RecipientDetails p WHERE p.InstituteID = :instituteId AND p.Received = false")
    List<String> findRecipientDetailsByInstituteId(@Param("instituteId") String instituteId);

}
