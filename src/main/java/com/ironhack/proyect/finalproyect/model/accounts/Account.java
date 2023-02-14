package com.ironhack.proyect.finalproyect.model.accounts;

import com.ironhack.proyect.finalproyect.enums.Status;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal balance;
    private String secretKey;

    @ManyToOne
    @JoinColumn(name = "primaryOwner_id")
    private AccountHolder primaryOwner;
    @ManyToOne
    @JoinColumn(name = "secondaryOwner_id")
    private AccountHolder secondaryOwner;
//    private BigDecimal minimumBalance;
    private BigDecimal penaltyFee =new BigDecimal(40).setScale(2, RoundingMode.HALF_DOWN);;
//    private BigDecimal monthlyMaintenanceFee;
    private Date creationDate;
    private Status status;

    public Account() {
    }

    public Account(BigDecimal balance, String secretKey, AccountHolder primaryOwner, AccountHolder secondaryOwner,
                   BigDecimal penaltyFee, Date creationDate, Status status) {
        this.balance = balance;
        this.secretKey = secretKey;
        this.primaryOwner = primaryOwner;
        this.secondaryOwner = secondaryOwner;
        this.penaltyFee = penaltyFee;
        this.creationDate = creationDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
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

    public BigDecimal getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(BigDecimal penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
