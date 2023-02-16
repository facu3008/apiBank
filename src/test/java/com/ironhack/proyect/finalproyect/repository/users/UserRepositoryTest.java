package com.ironhack.proyect.finalproyect.repository.users;

import com.ironhack.proyect.finalproyect.model.users.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRepositoryTest {
@Autowired
UserRepository userRepository;

User user1, user2;

    @BeforeEach
    void setUp() {
user1 = userRepository.save(new User("sds","22") {
});
    }

    @AfterEach
    void tearDown() {
        userRepository.deleteAll();
    }
    @Test
    void shouldCreateUsers_WhenSaveIsCalled(){
    assertEquals(1, userRepository.findAll().size());
    }
}