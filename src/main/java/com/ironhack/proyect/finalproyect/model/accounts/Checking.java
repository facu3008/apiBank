package com.ironhack.proyect.finalproyect.model.accounts;

import com.ironhack.proyect.finalproyect.enums.Status;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Checking extends Account{
    private  BigDecimal minimumBalance;
    private  BigDecimal monthlyMaintenanceFee;
    private final  LocalDate CREATION_DATE = LocalDate.now();

    @Enumerated(EnumType.STRING)
    private Status status;
    public Checking() {
    }

    public Checking(String secretKey, AccountHolder primaryOwner, AccountHolder secondaryOwner, Status status) {
        super(secretKey, primaryOwner, secondaryOwner);
        this.minimumBalance = new BigDecimal(250);
        this.monthlyMaintenanceFee  = new BigDecimal(12);
        this.status = status;
    }
    public Checking(String secretKey, AccountHolder primaryOwner, AccountHolder secondaryOwner, BigDecimal minimumBalance, BigDecimal monthlyMaintenanceFee) {
        super(secretKey, primaryOwner, secondaryOwner);
        this.minimumBalance = minimumBalance;
        this.monthlyMaintenanceFee  = monthlyMaintenanceFee;
    }

    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        minimumBalance.setScale(2, RoundingMode.HALF_DOWN);
        this.minimumBalance = minimumBalance;
    }

    public BigDecimal getMonthlyMaintenanceFee() {
        monthlyMaintenanceFee.setScale(2,RoundingMode.HALF_DOWN);
        return monthlyMaintenanceFee;
    }

    public void setMonthlyMaintenanceFee(BigDecimal monthlyMaintenanceFee) {
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
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
