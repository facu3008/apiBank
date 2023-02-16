package com.ironhack.proyect.finalproyect.model.accounts;

import com.ironhack.proyect.finalproyect.enums.Status;
import com.ironhack.proyect.finalproyect.model.accounts.Embedables.Money;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private Money balance;
    private String secretKey;

    @ManyToOne
    @JoinColumn(name = "primaryOwner_id")
    private AccountHolder primaryOwner;
    @ManyToOne
    @JoinColumn(name = "secondaryOwner_id")
    private AccountHolder secondaryOwner;
//    private BigDecimal minimumBalance;
    private final BigDecimal PENALTY_FEE =new BigDecimal(40);
//    private BigDecimal monthlyMaintenanceFee;
//    @Enumerated(EnumType.STRING)
//    private Status status;

    public Account() {
    }

    public Account( String secretKey, AccountHolder primaryOwner, AccountHolder secondaryOwner)
    {
        this.balance = new Money(new BigDecimal(0));
        this.secretKey = secretKey;
        this.primaryOwner = primaryOwner;
        this.secondaryOwner = secondaryOwner;
//        this.status = Status.ACTIVE;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Money getBalance() {
        return balance;
    }

    public void setBalance(Money balance) {
        this.balance = balance;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public AccountHolder getPrimaryOwner() {
        return primaryOwner;
    }

    public void setPrimaryOwner(AccountHolder primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public AccountHolder getSecondaryOwner() {
        return secondaryOwner;
    }

    public void setSecondaryOwner(AccountHolder secondaryOwner) {
        this.secondaryOwner = secondaryOwner;
    }

    public BigDecimal getPENALTY_FEE() {
        return PENALTY_FEE;
    }

//    public Status getStatus() {
//        return status;
//    }
//
//    public void setStatus(Status status) {
//        this.status = status;
//    }
}
