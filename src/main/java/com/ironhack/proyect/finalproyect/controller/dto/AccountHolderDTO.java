package com.ironhack.proyect.finalproyect.controller.dto;

import com.ironhack.proyect.finalproyect.model.users.Address;

import java.time.LocalDate;

public class AccountHolderDTO {

    private Long id;
    private String name;
    private String password;
 
    private LocalDate dateOfBirth;

    private Address address;
    private Address mailingAddress;

    public AccountHolderDTO(Long id, String name, String password, LocalDate dateOfBirth, Address address, Address mailingAddress) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.mailingAddress = mailingAddress;
    }

    public AccountHolderDTO(Long id, String name) {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
}
