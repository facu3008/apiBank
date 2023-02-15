package com.ironhack.proyect.finalproyect.model.accounts;

import com.ironhack.proyect.finalproyect.enums.Status;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class CreditCardAccount extends Account {
    @DecimalMin(value = "100")
    @DecimalMax(value = "100000")
    private BigDecimal creditLimit;
    @DecimalMin(value="0.10")
    @DecimalMax(value="0.20")
    private BigDecimal interestRate;


    public CreditCardAccount() {
    }

    public CreditCardAccount(String secretKey, AccountHolder primaryOwner, AccountHolder secondaryOwner) {
        super(secretKey, primaryOwner, secondaryOwner);
        this.creditLimit = new BigDecimal("100");
        this.interestRate = new BigDecimal("0.20");
    }
    public CreditCardAccount(String secretKey, AccountHolder primaryOwner, AccountHolder secondaryOwner, BigDecimal creditLimit, BigDecimal interestRate) {
        super(secretKey, primaryOwner, secondaryOwner);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        creditLimit.setScale(2, RoundingMode.HALF_DOWN);
        this.creditLimit = creditLimit;
    }

    public BigDecimal getInterestRate() {

        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        interestRate.setScale(2,RoundingMode.HALF_DOWN);
        this.interestRate = interestRate;
    }
}
