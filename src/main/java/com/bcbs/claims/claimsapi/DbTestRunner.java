package com.bcbs.claims.claimsapi;

import com.bcbs.claims.claimsapi.entity.Claim;
import com.bcbs.claims.claimsapi.repository.ClaimRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public class DbTestRunner implements CommandLineRunner {

    private final ClaimRepository repository;

    public DbTestRunner(ClaimRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Claim claim = new Claim();
        claim.setName("Test");
        claim.setPolicyNumber("TEST123");
        claim.setClaimAmount(new BigDecimal("123.45"));
        claim.setClaimType("ACCIDENT");
        claim.setStatus("PENDING");
        claim.setPayoutAmount(new BigDecimal("100.00"));

        repository.save(claim);
        System.out.println("Saved test claim successfully!");
    }
}
