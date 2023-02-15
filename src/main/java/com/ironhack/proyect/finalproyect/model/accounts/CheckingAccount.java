package com.ironhack.proyect.finalproyect.model.accounts;

import com.ironhack.proyect.finalproyect.enums.Status;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class CheckingAccount extends Account{
    private  BigDecimal minimumBalance;
    private  BigDecimal monthlyMaintenanceFee;
    private final  LocalDate CREATION_DATE = LocalDate.now();
    public CheckingAccount() {
    }

    public CheckingAccount(String secretKey, AccountHolder primaryOwner, AccountHolder secondaryOwner) {
        super(secretKey, primaryOwner, secondaryOwner);
        this.minimumBalance = new BigDecimal(250);
        this.monthlyMaintenanceFee  = new BigDecimal(12);
    }
    public CheckingAccount(String secretKey, AccountHolder primaryOwner, AccountHolder secondaryOwner, BigDecimal minimumBalance, BigDecimal monthlyMaintenanceFee) {
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
}
