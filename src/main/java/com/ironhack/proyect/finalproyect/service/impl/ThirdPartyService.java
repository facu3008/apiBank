package com.ironhack.proyect.finalproyect.service.impl;

import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import com.ironhack.proyect.finalproyect.model.users.Admin;
import com.ironhack.proyect.finalproyect.model.users.Role;
import com.ironhack.proyect.finalproyect.model.users.ThirdParty;
import com.ironhack.proyect.finalproyect.repository.users.RoleRepository;
import com.ironhack.proyect.finalproyect.repository.users.ThirdPartyRepository;
import com.ironhack.proyect.finalproyect.repository.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public class ThirdPartyService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ThirdPartyRepository thirdPartyRepository;
    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;


    public ThirdParty save(ThirdParty thirdParty){
        String encodedPassword = passwordEncoder.encode(thirdParty.getPassword());
        Role thirdRole = new Role("THIRD-PARTY");
        ThirdParty thirdParty1 = new ThirdParty(thirdParty.getName(), encodedPassword);
        thirdParty1.setRoles(List.of(thirdRole));
        thirdPartyRepository.save(thirdParty1);
        ThirdParty returnedThirdParty = new ThirdParty(thirdParty1.getId().toString(), thirdParty1.getName());

        return returnedThirdParty;
    }

    // delete the Third Party from the Repository
    public void removeThirdParty(Long id){
        thirdPartyRepository.deleteById(id);
    }
}
