package com.ironhack.proyect.finalproyect.service.impl;

import com.ironhack.proyect.finalproyect.model.accounts.Checking;
import com.ironhack.proyect.finalproyect.model.accounts.Savings;
import com.ironhack.proyect.finalproyect.repository.accounts.CheckingRepository;
import com.ironhack.proyect.finalproyect.repository.accounts.SavingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavingsService {
    @Autowired
    SavingsRepository savingsRepository;


    public List<Savings> getSavingsAccounts() {
        return savingsRepository.findAll();
    }


}
