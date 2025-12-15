package com.bcbs.claims.claimsapi.controller;

import com.bcbs.claims.claimsapi.service.CobolSimulatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/claims")
public class ClaimController {

    @Autowired
    private CobolSimulatorService simulatorService;

    @PostMapping("/process")
    public String processClaims() {
        try {
            simulatorService.processClaims();
            return "Claims processed successfully.";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error processing claims: " + e.getMessage();
        }
    }

    @GetMapping("/output")
    public String getOutput() {
        try {
            return simulatorService.readOutput();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading output: " + e.getMessage();
        }
    }
}
