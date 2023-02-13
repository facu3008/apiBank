package com.ironhack.proyect.finalproyect.model.accounts;

import com.ironhack.proyect.finalproyect.enums.Status;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class SavingsAccount extends Account{

    private BigDecimal minimumBalance;
    private BigDecimal interestRate;

    public SavingsAccount() {
    }

    public SavingsAccount(BigDecimal balance, String secretKey, AccountHolder primaryOwner,
                          AccountHolder secondaryOwner, BigDecimal penaltyFee, Date creationDate,
                          Status status, BigDecimal minimumBalance, BigDecimal interestRate) {
        super(balance, secretKey, primaryOwner, secondaryOwner, penaltyFee, creationDate, status);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
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
}
