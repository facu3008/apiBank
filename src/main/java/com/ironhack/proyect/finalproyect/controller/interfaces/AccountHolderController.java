package com.ironhack.proyect.finalproyect.controller.interfaces;

import com.ironhack.proyect.finalproyect.controller.dto.AccountHolderDTO;
import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.model.accounts.Account;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;

import java.util.List;

public interface AccountHolderController {
//    AccountHolder getAccountHolderById(Long id);
//    List<AccountHolder> getAccounts();

    List<AccountHolder> findAll();
    AccountHolder findById(Long id);
    AccountHolderDTO store(AccountHolderDTO accountHolderDTO);


    void deleteAccountHolder(Long accountHolderId);

}