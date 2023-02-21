package com.ironhack.proyect.finalproyect.service.impl;

import com.ironhack.proyect.finalproyect.model.accounts.Account;
import com.ironhack.proyect.finalproyect.repository.accounts.AccountRepository;
import com.ironhack.proyect.finalproyect.repository.users.AccountHolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    AccountHolderRepository accountHolderRepository;

    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    public Account findById(Long id){
        return accountRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "This account does not exist"));
    }

    public Account findByName(String name){
        return accountRepository.findByPrimaryOwnerName(name).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "There is no account for this Name"));
    }
    public void deleteAccount(Long id){
        accountRepository.deleteById(id);
    }








}
