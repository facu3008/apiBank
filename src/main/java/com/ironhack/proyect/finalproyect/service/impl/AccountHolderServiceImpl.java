package com.ironhack.proyect.finalproyect.service.impl;

import com.ironhack.proyect.finalproyect.controller.dto.AccountHolderDTO;
import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.controller.dto.BalanceDTO;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import com.ironhack.proyect.finalproyect.model.users.Admin;
import com.ironhack.proyect.finalproyect.model.users.Role;
import com.ironhack.proyect.finalproyect.repository.users.AccountHolderRepository;
import com.ironhack.proyect.finalproyect.repository.users.RoleRepository;
import com.ironhack.proyect.finalproyect.service.interfaces.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountHolderServiceImpl implements AccountHolderService {
    @Autowired
    private AccountHolderRepository accountHolderRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    RoleRepository roleRepository;

//    private final Role accountHolder = new Role("ACCOUNT_HOLDER");

    //Listar todas las cuentas
    @Override
    public List<AccountHolder> getAccounts() {
        return null;
    }

    //Buscar cuenta pot id- esto lo hace el admin
    @Override
    public AccountHolder getAccountHolderById(Long id) {
        Optional<AccountHolder> accountHolderOptional = accountHolderRepository.findById(id);

        if (accountHolderOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Owner not found");
        }

        return accountHolderOptional.get();
    }



    //Crear Account-Holder y encriptar password
    public AccountHolderDTO saveAccountHolder(AccountHolderDTO accountHolderDTO) {
        String encodedPassword = passwordEncoder.encode(accountHolderDTO.getPassword());
        Role accountRole = new Role("ACCOUNT_HOLDER");
        AccountHolder accountHolder1 = new AccountHolder(accountHolderDTO.getName(), encodedPassword);
        Role role = roleRepository.findByRole("ACCOUNT-HOLDER");
        accountHolder1.getRoles().add(role);
        accountHolderRepository.save(accountHolder1);
        AccountHolderDTO returnedAccountHolderDTO = new AccountHolderDTO(accountHolder1.getId(),accountHolder1.getName());
        return returnedAccountHolderDTO;
    }

//    @Override
//    public List<BalanceDTO> checkBalance(Long accountHolderId) {
//        return null;
//    }

    //Eliminar usuario
    @Override
    public void deleteAccountHolder(Long accountHolderId) {
        AccountHolder accountHolder = getAccountHolderById(accountHolderId);
        accountHolderRepository.delete(accountHolder);
    }






}
