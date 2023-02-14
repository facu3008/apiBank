package com.ironhack.proyect.finalproyect.repository.accounts;

import com.ironhack.proyect.finalproyect.model.accounts.StudentAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAccountRepository extends JpaRepository<StudentAccount, Long> {
}
