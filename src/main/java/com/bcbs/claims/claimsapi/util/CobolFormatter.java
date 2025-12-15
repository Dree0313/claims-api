package com.bcbs.claims.claimsapi.util;

import com.bcbs.claims.claimsapi.entity.Claim;

public class CobolFormatter {

    public static String format(Claim claim) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-10s", claim.getClaimsId()));
        sb.append(String.format("%-15s", claim.getClaimType()));
        sb.append(String.format("%-20s", claim.getName()));
        sb.append(String.format("%010.2f", claim.getClaimAmount()));
        sb.append(String.format("%010.2f", claim.getPayoutAmount()));
        sb.append(String.format("%-15s", claim.getPolicyNumber()));
        sb.append(String.format("%-10s", claim.getStatus()));
        return sb.toString();
    }
}

