package com.ironhack.proyect.finalproyect.controller.impl;

import com.ironhack.proyect.finalproyect.controller.dto.AccountHolderDTO;
import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.controller.interfaces.AccountHolderController;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import com.ironhack.proyect.finalproyect.repository.users.AccountHolderRepository;
import com.ironhack.proyect.finalproyect.service.interfaces.AccountHolderService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountHolderControllerImpl implements AccountHolderController {

    @Autowired
    private AccountHolderRepository accountHolderRepository;
    @Autowired
    private AccountHolderService accountHolderService;


    @GetMapping("/account_holder")
    public List<AccountHolder> findAll() {
        return accountHolderRepository.findAll();
    }

    @GetMapping("/account_holder/{id}")
    public AccountHolder findById(@PathVariable Long id) {
        return accountHolderRepository.findById(id).get();
    }

    @PostMapping("/account_holder")
    @ResponseStatus(HttpStatus.CREATED)
    public AccountHolderDTO store(@RequestBody @Valid AccountHolderDTO accountHolderDTO) {
        return accountHolderService.saveAccountHolder(accountHolderDTO);
    }
//    @PostMapping("/admin")
//    @ResponseStatus(HttpStatus.CREATED)
//    public AdminDTO store(@RequestBody @Valid AdminDTO adminDTO) {
//        return adminService.saveAdmin(adminDTO);
//    }


    @Override
    public void deleteAccountHolder(Long accountHolderId) {

    }
}
