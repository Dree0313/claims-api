package com.bcbs.claims.claimsapi.repository;

import com.bcbs.claims.claimsapi.entity.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClaimRepository extends JpaRepository<Claim, Integer> {
}
