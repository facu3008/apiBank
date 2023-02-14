package com.ironhack.proyect.finalproyect.model.accounts;

import com.ironhack.proyect.finalproyect.enums.Status;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class SavingsAccount extends Account{

    @DecimalMin(value="100")
    private BigDecimal minimumBalance = new BigDecimal("1000").setScale(2,RoundingMode.HALF_DOWN);
    @DecimalMin(value="0")
    @DecimalMax(value="0.5")
    private BigDecimal interestRate = new BigDecimal("0.0025").setScale(4, RoundingMode.HALF_DOWN);


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
