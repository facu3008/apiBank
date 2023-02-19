package com.ironhack.proyect.finalproyect.controller.impl;
import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.controller.dto.CheckingDTO;
import com.ironhack.proyect.finalproyect.controller.dto.SavingsDTO;
import com.ironhack.proyect.finalproyect.controller.interfaces.AdminController;
import com.ironhack.proyect.finalproyect.model.accounts.*;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import com.ironhack.proyect.finalproyect.model.users.Admin;
import com.ironhack.proyect.finalproyect.model.users.User;
import com.ironhack.proyect.finalproyect.repository.accounts.SavingsRepository;
import com.ironhack.proyect.finalproyect.repository.users.AdminRepository;
import com.ironhack.proyect.finalproyect.service.impl.*;
import com.ironhack.proyect.finalproyect.service.interfaces.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminControllerImpl implements AdminController {

    @Autowired
    AdminRepository adminRepository;
    @Autowired
    AdminService adminService;

    @Autowired
    AccountService accountService;

    @Autowired
    CheckingService checkingService;
    @Autowired
    CreditCardService creditCardService;
    @Autowired
    StudentService studentService;

    @Autowired
    SavingsService savingsService;

    @GetMapping("/accounts/all")
    public List<Account> getAccounts() {
        return accountService.findAll();
    }

    @GetMapping("/accounts/all/checking")
    @ResponseStatus(HttpStatus.OK)
    public List<Checking> getAllCheckings() {
        return checkingService.getCheckingAccounts();
    }

    @GetMapping("/accounts/all/student")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudents() {
        return studentService.getStudentAccounts();
    }

    @GetMapping("/accounts/all/creditcard")
    @ResponseStatus(HttpStatus.OK)
    public List<CreditCard> getAllCreditCards() {
        return creditCardService.getCreditCardAccounts();
    }

    @GetMapping("/accounts/all/savings")
    @ResponseStatus(HttpStatus.OK)
    public List<Savings> getAllSavings() {
        return savingsService.getSavingsAccounts();
    }

    @GetMapping("/accounts/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Account getAccountById(@PathVariable Long id) {
        return accountService.findById(id);
    }

    @GetMapping("/accounts/user")
    @ResponseStatus(HttpStatus.OK)
    public Account getAccountByUserName(@RequestParam String userName) {
        return accountService.findByName(userName);
    }





    @GetMapping("/admin")
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }




    @GetMapping("/admin/{id}")
    public Admin findById(@PathVariable Long id) {
        return adminRepository.findById(id).get();
    }

    @PostMapping("/admin")
    @ResponseStatus(HttpStatus.CREATED)
    public AdminDTO store(@RequestBody @Valid AdminDTO adminDTO) {
        return adminService.save(adminDTO);
    }

    @DeleteMapping("/accounts")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void deleteAccount(@RequestParam Long id){
        accountService.deleteAccount(id);
    }





}
