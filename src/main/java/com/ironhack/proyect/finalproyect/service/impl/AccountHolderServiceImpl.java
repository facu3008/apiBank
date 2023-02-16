package com.ironhack.proyect.finalproyect.service.impl;

import com.ironhack.proyect.finalproyect.controller.dto.AccountHolderDTO;
import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import com.ironhack.proyect.finalproyect.model.users.Admin;
import com.ironhack.proyect.finalproyect.model.users.Role;
import com.ironhack.proyect.finalproyect.repository.users.AccountHolderRepository;
import com.ironhack.proyect.finalproyect.service.interfaces.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AccountHolderServiceImpl implements AccountHolderService {
    @Autowired
    private AccountHolderRepository accountHolderRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Override
    public List<AccountHolder> getAccounts() {
        return null;
    }

    @Override
    public AccountHolder getAccountHolderById(Long id) {
        Optional<AccountHolder> accountHolderOptional = accountHolderRepository.findById(id);

        if (accountHolderOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Owner not found");
        }

        return accountHolderOptional.get();
    }






//    @Override
//    public AccountHolder saveAccountHolder(AccountHolder accountHolder) {
//        if (accountHolder.getId() != null && accountHolderRepository.existsById(accountHolder.getId())) {
//            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "This id: " + accountHolder.getId() + " already exists for another checking");
//        }
//        return accountHolderRepository.save(accountHolder);
//    }


    public AccountHolderDTO saveAccountHolder(AccountHolderDTO accountHolderDTO) {
        String encodedPassword = passwordEncoder.encode(accountHolderDTO.getPassword());
        Role adminRole = new Role("ADMIN");
        AccountHolder accountHolder1 = new AccountHolder(accountHolderDTO.getName(), encodedPassword);
        accountHolder1.setRoles(List.of(adminRole));
        accountHolderRepository.save(accountHolder1);
        AccountHolderDTO returnedAccountHolderDTO = new AccountHolderDTO(accountHolder1.getId(),accountHolder1.getName());
        return returnedAccountHolderDTO;
    }

    @Override
    public void deleteAccountHolder(Long accountHolderId) {
        AccountHolder accountHolder = getAccountHolderById(accountHolderId);
        accountHolderRepository.delete(accountHolder);
    }






}
