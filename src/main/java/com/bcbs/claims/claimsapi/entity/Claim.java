package com.bcbs.claims.claimsapi.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "CLAIMS")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer claimsId;

    private String name;
    private String policyNumber;
    private BigDecimal claimAmount;
    private String claimType;
    private String status;
    private BigDecimal payoutAmount;

    //Getters and Setters
    public Integer getClaimsId() { return claimsId; }
    public void setClaimsId(Integer claimsId) {this.claimsId = claimsId; }

    public String getName() {return name; }
    public void setName(String name) { this.name = name; }

    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }

    public BigDecimal getClaimAmount() {return claimAmount; }
    public void setClaimAmount(BigDecimal claimAmount) { this.claimAmount = claimAmount; }

    public String getClaimType() {return claimType; }
    public void setClaimType(String claimType) { this.claimType = claimType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public BigDecimal getPayoutAmount() { return payoutAmount; }
    public void setPayoutAmount(BigDecimal payoutAmount) { this.payoutAmount = payoutAmount; }
}
