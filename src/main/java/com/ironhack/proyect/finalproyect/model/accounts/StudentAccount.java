package com.ironhack.proyect.finalproyect.model.accounts;

import com.ironhack.proyect.finalproyect.enums.Status;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
@Entity
@PrimaryKeyJoinColumn(name="id")
public class StudentAccount extends Account{
    private final  LocalDate CREATION_DATE = LocalDate.now();
    public StudentAccount() {
    }



}
