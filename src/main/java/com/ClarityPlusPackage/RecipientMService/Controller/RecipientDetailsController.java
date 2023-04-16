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

    @GetMapping("/search/{instituteID}")
    public ResponseEntity<List<RecipientDetails>> searchByInstituteId(@PathVariable("instituteID") String instituteID){

        return ResponseEntity.ok(this.recipientDetailsService.searchByInstituteId(instituteID));

    }
    //Implemented by double A
    //@PostMapping("")
}
