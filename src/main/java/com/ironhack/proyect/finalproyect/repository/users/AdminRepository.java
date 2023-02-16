package com.ironhack.proyect.finalproyect.repository.users;

import com.ironhack.proyect.finalproyect.model.users.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}