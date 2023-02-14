package com.ironhack.proyect.finalproyect.repository.accounts;

import com.ironhack.proyect.finalproyect.model.accounts.SavingsAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Long> {
}
