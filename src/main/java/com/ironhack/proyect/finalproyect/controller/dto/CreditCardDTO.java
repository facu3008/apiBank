package com.ironhack.proyect.finalproyect.controller.dto;

import com.ironhack.proyect.finalproyect.model.accounts.Embedables.Money;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;

import java.math.BigDecimal;

public class CreditCardDTO {
    private BigDecimal balance;
    private AccountHolder primaryOwner;

    private String name;

    private AccountHolder secondaryOwnerId;
    private String secretKey;
    private Money minimumBalance;
    private BigDecimal interestRate;

    public CreditCardDTO(BigDecimal balance, AccountHolder primaryOwner, String name, AccountHolder secondaryOwnerId, String secretKey, Money minimumBalance, BigDecimal interestRate) {
        this.balance = balance;
        this.primaryOwner = primaryOwner;
        this.name = name;
        this.secondaryOwnerId = secondaryOwnerId;
        this.secretKey = secretKey;
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public AccountHolder getPrimaryOwner() {
        return primaryOwner;
    }

    public void setPrimaryOwner(AccountHolder primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountHolder getSecondaryOwnerId() {
        return secondaryOwnerId;
    }

    public void setSecondaryOwnerId(AccountHolder secondaryOwnerId) {
        this.secondaryOwnerId = secondaryOwnerId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Money getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(Money minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }
}
