package com.bcbs.claims.claimsapi.service;

import org.springframework.stereotype.Service;
import java.io.*;
import java.nio.file.*;

@Service
public class CobolSimulatorService {

    private static final Path INPUT_FILE = Paths.get("claims_input.txt");
    private static final Path OUTPUT_FILE = Paths.get("claims_output.txt");

    public void processClaims() throws IOException {
        if (!Files.exists(INPUT_FILE)) {
            throw new FileNotFoundException("Input file claims_input.txt not found");
        }

        try (BufferedReader reader = Files.newBufferedReader(INPUT_FILE);
             BufferedWriter writer = Files.newBufferedWriter(OUTPUT_FILE)) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String policy = parts[1];
                double amount = Double.parseDouble(parts[2]);
                String type = parts[3];

                double payout;
                switch (type.toUpperCase()) {
                    case "ACCIDENT": payout = amount * 0.8; break;
                    case "FIRE": payout = amount * 0.9; break;
                    default: payout = amount * 0.7; break;
                }

                String outputLine = String.format("%-20s%-10s%010.2f%-10s",
                        name, policy, payout, type);
                writer.write(outputLine);
                writer.newLine();
            }
        }
    }

    public String readOutput() throws IOException {
        if (!Files.exists(OUTPUT_FILE)) {
            return "No output available yet";
        }
        return Files.readString(OUTPUT_FILE);
    }
}
