package com.ironhack.proyect.finalproyect.repository.users;

import com.ironhack.proyect.finalproyect.model.users.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
