package com.ironhack.proyect.finalproyect.service.interfaces;


import com.ironhack.proyect.finalproyect.controller.dto.AccountHolderDTO;
import com.ironhack.proyect.finalproyect.controller.dto.BalanceDTO;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;

import java.util.List;

public interface AccountHolderService {
    List<AccountHolder> getAccounts();


    AccountHolder getAccountHolderById(Long id);
    AccountHolderDTO saveAccountHolder(AccountHolderDTO accountHolderDTO);

//    List<BalanceDTO> checkBalance (Long accountHolderId);

    void deleteAccountHolder(Long accountHolder);
}
