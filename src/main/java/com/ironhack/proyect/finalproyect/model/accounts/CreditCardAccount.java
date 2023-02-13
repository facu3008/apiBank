package com.ironhack.proyect.finalproyect.model.accounts;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.math.BigDecimal;
@Entity
@PrimaryKeyJoinColumn(name="id")
public class CreditCardAccount extends Account {

    private BigDecimal creditLimit;
    private BigDecimal interestRate;

    public CreditCardAccount() {
    }



}
