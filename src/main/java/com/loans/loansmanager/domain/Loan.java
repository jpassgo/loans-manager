package com.loans.loansmanager.domain;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;

public abstract class Loan {
    private BigDecimal principle;
    private BigDecimal rate;
    private LocalDate startDate;
    private Duration term;
    private Borrower borrower;

    //
    public LocalDate calculateEndDate() {
        return LocalDate.now();
    }
}
