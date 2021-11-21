package com.loans.loansmanager.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Borrower {

    private String firstName;
    private String middleName;
    private String lastName;
    private SocialSecurityNumber socialSecurityNumber;
    private LocalDate dateOfBirth;

}
