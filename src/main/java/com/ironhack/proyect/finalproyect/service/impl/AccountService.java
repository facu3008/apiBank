package com.ironhack.proyect.finalproyect.service.impl;

import com.ironhack.proyect.finalproyect.model.accounts.Account;
import com.ironhack.proyect.finalproyect.repository.accounts.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    public Account createNewAccount(Account account){
        return accountRepository.save(account);
    }

}
