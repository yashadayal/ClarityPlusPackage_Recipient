package com.ClarityPlusPackage.RecipientMService.Controller;


import com.ClarityPlusPackage.RecipientMService.Entity.RecipientDetails;
import com.ClarityPlusPackage.RecipientMService.Service.RecipientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipient")
public class RecipientDetailsController {

    @Autowired
    private RecipientDetailsService recipientDetailsService;

    @GetMapping("/search/{instituteID}/")
    public ResponseEntity<List<RecipientDetails>> searchByInstituteID(@PathVariable("instituteID") String instituteID){
        System.out.println("Inside Recipient Controller");
        return ResponseEntity.ok(this.recipientDetailsService.searchByInstituteID(instituteID));

    }
    //Implemented by double A
    //@PostMapping("")
}
