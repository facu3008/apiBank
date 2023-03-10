package com.ironhack.proyect.finalproyect.service.impl;

import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.controller.dto.CheckingDTO;
import com.ironhack.proyect.finalproyect.controller.dto.SavingsDTO;
import com.ironhack.proyect.finalproyect.model.users.Admin;
import com.ironhack.proyect.finalproyect.model.users.Role;
import com.ironhack.proyect.finalproyect.repository.users.AdminRepository;
import com.ironhack.proyect.finalproyect.repository.users.RoleRepository;
import com.ironhack.proyect.finalproyect.service.interfaces.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    RoleRepository roleRepository;

//    @Override
//    public Admin getAdminById(Long id) {
//        Optional<Admin> adminOptional = adminRepository.findById(id);
//
//        if (adminOptional.isEmpty()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "admin not found");
//        }
//
//        return adminOptional.get();
//    }

//    @Override
//    public List<Admin> getAdmins() {
//        return null;
//    }


    public AdminDTO save(AdminDTO adminDTO) {
        String encodedPassword = passwordEncoder.encode(adminDTO.getPassword());
        Role adminRole = new Role("ADMIN");
//        Role role = roleRepository.findByRole("ADMIN");
        Admin admin1 = new Admin(adminDTO.getName(), encodedPassword);
        admin1.setRoles(List.of(adminRole));
//        admin1.getRoles().add(role);
        adminRepository.save(admin1);
        AdminDTO returnedAdminDTO = new AdminDTO(admin1.getId(),admin1.getName());
        return returnedAdminDTO;
    }

    public Admin addAdmin(Admin admin){

        admin.setPassword(passwordEncoder.encode(admin.getPassword()));
        Admin newAdmin = adminRepository.save(admin);
        Role role = roleRepository.findByRole("ADMIN");
        // Add the role to the user's role collection
        newAdmin.getRoles().add(role);
        adminRepository.save(newAdmin);
        //roleRepository.save(new Role("ADMIN", newAdmin));

        return newAdmin;
    }


}
