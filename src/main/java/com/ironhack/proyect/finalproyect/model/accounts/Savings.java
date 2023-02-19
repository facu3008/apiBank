package com.ironhack.proyect.finalproyect.model.accounts;

import com.ironhack.proyect.finalproyect.enums.Status;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Savings extends Account{

    @DecimalMin(value="100")
    private BigDecimal minimumBalance = new BigDecimal("1000").setScale(2,RoundingMode.HALF_DOWN);
    @DecimalMin(value="0")
    @DecimalMax(value="0.5")
    private BigDecimal interestRate = new BigDecimal("0.0025").setScale(4, RoundingMode.HALF_DOWN);

    private final  LocalDate CREATION_DATE = LocalDate.now();
    @Enumerated(EnumType.STRING)
    private Status status;
    public Savings() {
    }

    public Savings(String secretKey, AccountHolder primaryOwner, AccountHolder secondaryOwner, BigDecimal minimumBalance, BigDecimal interestRate, Status status) {
        super(secretKey, primaryOwner, secondaryOwner);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
        this.status = status;
    }


    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }


    public LocalDate getCREATION_DATE() {
        return CREATION_DATE;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
