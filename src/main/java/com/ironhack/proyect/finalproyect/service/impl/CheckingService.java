package com.ironhack.proyect.finalproyect.service.impl;

import com.ironhack.proyect.finalproyect.model.accounts.Account;
import com.ironhack.proyect.finalproyect.model.accounts.Checking;
import com.ironhack.proyect.finalproyect.repository.accounts.CheckingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckingService {
    @Autowired
    CheckingRepository checkingRepository;


    public List<Checking> getCheckingAccounts() {
        return checkingRepository.findAll();
    }
}
