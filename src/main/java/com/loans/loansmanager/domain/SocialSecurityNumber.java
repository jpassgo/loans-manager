package com.loans.loansmanager.domain;

import lombok.Data;

@Data
public class SocialSecurityNumber {
    private String socialSecurityNumber;

    public String getLastFour() {
        return socialSecurityNumber.substring((socialSecurityNumber.length()-1) - 4);
    }
}
