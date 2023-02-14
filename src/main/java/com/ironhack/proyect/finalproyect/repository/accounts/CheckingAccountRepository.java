package com.ironhack.proyect.finalproyect.repository.accounts;

import com.ironhack.proyect.finalproyect.model.accounts.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Long> {
}
