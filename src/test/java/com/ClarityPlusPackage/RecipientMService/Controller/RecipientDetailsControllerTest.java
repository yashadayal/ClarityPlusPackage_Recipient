package com.ClarityPlusPackage.RecipientMService.Controller;
import com.ClarityPlusPackage.RecipientMService.Controller.RecipientDetailsController;
import com.ClarityPlusPackage.RecipientMService.Service.RecipientDetailsService;
import com.ClarityPlusPackage.RecipientMService.DTO.RecipientDetailsDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class RecipientDetailsControllerTest {
    @Mock
    private RecipientDetailsService recipientDetailsService;

    @InjectMocks
    private RecipientDetailsController recipientDetailsController;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void testSearchByInstituteID() {
        // Mocked data
        String instituteID = "12345";
        List<String> recipients = Arrays.asList("Recipient 1", "Recipient 2");

        // Mock the behavior of recipientDetailsService.searchByInstituteID()
        when(recipientDetailsService.searchByInstituteID(instituteID)).thenReturn(recipients);

        // Call the controller method
        ResponseEntity<List<String>> response = recipientDetailsController.searchByInstituteID(instituteID);

        // Verify the mocked behavior
        verify(recipientDetailsService).searchByInstituteID(instituteID);

        // Verify the response
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(recipients, response.getBody());
    }
    @Test
    void testSearchLogsByInstituteID() {
        // Mocked data
        String instituteID = "12345";
        List<String> logs = Arrays.asList("Log 1", "Log 2");

        // Mock the behavior of recipientDetailsService.searchLogsByInstituteID()
        when(recipientDetailsService.searchLogsByInstituteID(instituteID)).thenReturn(logs);

        // Call the controller method
        ResponseEntity<List<String>> response = recipientDetailsController.searchLogsByInstituteID(instituteID);

        // Verify the mocked behavior
        verify(recipientDetailsService).searchLogsByInstituteID(instituteID);

        // Verify the response
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(logs, response.getBody());
    }
    @Test
    void testSaveData() {
        // Mocked data
        RecipientDetailsDTO recipientDetailsDTO = new RecipientDetailsDTO();
        recipientDetailsDTO.setRecipientFirstName("John Doe");
        recipientDetailsDTO.setRecipientFirstName("john.doe@example.com");
        String successMessage = "Data saved successfully";

        // Mock the behavior of recipientDetailsService.saveData()
        when(recipientDetailsService.saveData(recipientDetailsDTO)).thenReturn(successMessage);

        // Call the controller method
        ResponseEntity<String> response = recipientDetailsController.saveData(recipientDetailsDTO);

        // Verify the mocked behavior
        verify(recipientDetailsService).saveData(recipientDetailsDTO);

        // Verify the response
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(successMessage, response.getBody());
    }

}
