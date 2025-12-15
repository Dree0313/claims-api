package com.bcbs.claims.claimsapi.util;

import com.bcbs.claims.claimsapi.entity.Claim;

public class CobolFormatter {

    public static String format(Claim claim) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s", claim.getClaimsId()));      // 10 chars for ID
        sb.append(String.format("%-15s", claim.getClaimType()));     // 15 chars for type
        sb.append(String.format("%-20s", claim.getName()));          // 20 chars for name
        sb.append(String.format("%010.2f", claim.getClaimAmount())); // 10 chars, padded decimals
        sb.append(String.format("%010.2f", claim.getPayoutAmount()));
        sb.append(String.format("%-15s", claim.getPolicyNumber()));  // 15 chars for policy
        sb.append(String.format("%-10s", claim.getStatus()));        // 10 chars for status
        return sb.toString();
    }
}

