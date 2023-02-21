package com.ironhack.proyect.finalproyect.controller.impl;

import com.ironhack.proyect.finalproyect.controller.dto.AccountHolderDTO;
import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.controller.interfaces.AccountHolderController;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import com.ironhack.proyect.finalproyect.model.users.Address;
import com.ironhack.proyect.finalproyect.repository.users.AccountHolderRepository;
import com.ironhack.proyect.finalproyect.service.impl.AccountHolderService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountHolderControllerImpl {

    @Autowired
    private AccountHolderRepository accountHolderRepository;
    @Autowired
    private AccountHolderService accountHolderService;

//debo de crear un get para ver el balance
    //debo de crear algo como para hacer la trasferencia

    @GetMapping("/account_holder")
    public List<AccountHolder> findAll() {
        return accountHolderRepository.findAll();
    }

    @GetMapping("/account_holder/{id}")
    public AccountHolder findById(@PathVariable Long id) {
        return accountHolderRepository.findById(id).get();
    }

    @PutMapping("/update-address")
    @ResponseStatus(HttpStatus.OK)
    public AccountHolder updateAddressInfo(@RequestParam Long id, @RequestBody Address address){
        return accountHolderService.updateAddressInfo(id, address);
    }

}

/* el Administrador tiene que ver saldo de todos.
modificar saldo
crear cuentas. 1 post con condicionales o 4 post.

 */