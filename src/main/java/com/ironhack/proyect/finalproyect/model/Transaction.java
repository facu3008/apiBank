package com.ironhack.proyect.finalproyect.model;

import com.ironhack.proyect.finalproyect.model.accounts.Account;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Account senderAccount;


    @ManyToOne
    private Account receiverAccount;

    @NotNull
    private String receiverName;

    @NotNull
    private BigDecimal transferAmount;

    private LocalDate transactionDate;

    public Transaction() {
    }

    public Transaction(Account senderAccount, Account receiverAccount, String receiverName, BigDecimal transferAmount) {
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.receiverName = receiverName;
        this.transferAmount = transferAmount;
        this.transactionDate= LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getSenderAccount() {
        return senderAccount;
    }

    public void setSenderAccount(Account senderAccount) {
        this.senderAccount = senderAccount;
    }

    public Account getReceiverAccount() {
        return receiverAccount;
    }

    public void setReceiverAccount(Account receiverAccount) {
        this.receiverAccount = receiverAccount;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public BigDecimal getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(BigDecimal transferAmount) {
        this.transferAmount = transferAmount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
}
