package com.ironhack.proyect.finalproyect.model.accounts;

import com.ironhack.proyect.finalproyect.enums.Status;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Student extends Account{
    private final  LocalDate CREATION_DATE = LocalDate.now();
    @Enumerated(EnumType.STRING)
    private Status status;
    public Student() {
    }

    public Student(String secretKey, AccountHolder primaryOwner, AccountHolder secondaryOwner, Status status) {
        super(secretKey, primaryOwner, secondaryOwner);
        this.status = status;
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
