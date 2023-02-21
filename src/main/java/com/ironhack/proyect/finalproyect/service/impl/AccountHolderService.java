package com.ironhack.proyect.finalproyect.service.impl;

import com.ironhack.proyect.finalproyect.controller.dto.AccountHolderDTO;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import com.ironhack.proyect.finalproyect.model.users.Address;
import com.ironhack.proyect.finalproyect.model.users.Role;
import com.ironhack.proyect.finalproyect.repository.users.AccountHolderRepository;
import com.ironhack.proyect.finalproyect.repository.users.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AccountHolderService {
    @Autowired
    private AccountHolderRepository accountHolderRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    RoleRepository roleRepository;

//    private final Role accountHolder = new Role("ACCOUNT_HOLDER");

    //Listar todas las cuentas
//    @Override
//    public List<AccountHolder> getAccounts() {
//        return null;
//    }

    //Buscar cuenta pot id- esto lo hace el admin
//    @Override
//    public AccountHolder getAccountHolderById(Long id) {
//        Optional<AccountHolder> accountHolderOptional = accountHolderRepository.findById(id);
//
//        if (accountHolderOptional.isEmpty()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Owner not found");
//        }
//
//        return accountHolderOptional.get();
//    }



    //Crear Account-Holder y encriptar password
    public AccountHolder saveAccountHolder(AccountHolder accountHolder) {

       String encodedPassword = passwordEncoder.encode(accountHolder.getPassword());
        Role accountRole = new Role("ACCOUNT_HOLDER");
        AccountHolder accountHolder1 = new AccountHolder(accountHolder.getName(), encodedPassword);
        accountHolder1.setRoles(List.of(accountRole));

        accountHolderRepository.save(accountHolder1);
        AccountHolder returnedAccountHolder = new AccountHolder(accountHolder1.getId(),accountHolder1.getName());
        return returnedAccountHolder;
    }

    public AccountHolder updateAddressInfo(Long userId, Address address){
        // check if the Account exists.
        AccountHolder accountHolderFromDB = accountHolderRepository.findById(userId).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Account Holder not found"));
        // get the existing Address Information from the Database.
        Address addressFromDB = accountHolderFromDB.getPrimaryAddress();

        // Overwrite existing Address Information with the new Address inputs, if one field of the new Address is empty, the existing Info will not be overwritten.
        if(!address.getStreetAddress().isEmpty()) addressFromDB.setStreetAddress(address.getStreetAddress());
        if(!address.getCity().isEmpty()) addressFromDB.setCity(address.getCity());
        if(!address.getState().isEmpty()) addressFromDB.setState(address.getState());
        if(!address.getZipCode().isEmpty()) addressFromDB.setZipCode(address.getZipCode());

        //assign the updated Address again to the Account Holder Info and save it in the Database.
        accountHolderFromDB.setPrimaryAddress(addressFromDB);
        return accountHolderRepository.save(accountHolderFromDB);
    }










}
