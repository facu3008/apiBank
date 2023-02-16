package com.ironhack.proyect.finalproyect.repository.users;

import com.ironhack.proyect.finalproyect.model.users.*;
import com.ironhack.proyect.finalproyect.model.users.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountHolderRepositoryTest {
    @Autowired
    private AccountHolderRepository accountHolderRepository;

    private AccountHolder accountHolder1;
    private AccountHolder accountHolder2;
    private AccountHolder accountHolder3;

    @BeforeEach
    void setUp() {
        accountHolder1 = new AccountHolder("Facu","123", null, null);

        accountHolderRepository.save(accountHolder1);

    }

    @AfterEach
    void tearDown() {
        accountHolderRepository.deleteAll();
    }

    @Test
    public void testFindById() {
        Optional<AccountHolder> accountHolderOptional = accountHolderRepository.findByName(accountHolder1.getName());
        assertEquals("Facu", accountHolderOptional.get().getName());
    }


}