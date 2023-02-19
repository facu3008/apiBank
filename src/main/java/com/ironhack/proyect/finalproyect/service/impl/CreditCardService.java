package com.ironhack.proyect.finalproyect.service.impl;

import com.ironhack.proyect.finalproyect.model.accounts.Checking;
import com.ironhack.proyect.finalproyect.model.accounts.CreditCard;
import com.ironhack.proyect.finalproyect.repository.accounts.CheckingRepository;
import com.ironhack.proyect.finalproyect.repository.accounts.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {
    @Autowired
    CreditCardRepository creditCardRepository;


    public List<CreditCard> getCreditCardAccounts() {
        return creditCardRepository.findAll();
    }
}
