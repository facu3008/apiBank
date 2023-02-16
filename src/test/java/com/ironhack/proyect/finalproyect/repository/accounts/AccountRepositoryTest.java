package com.ironhack.proyect.finalproyect.repository.accounts;

import com.ironhack.proyect.finalproyect.model.accounts.Account;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountRepositoryTest {
@Autowired
AccountRepository accountRepository;


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
}