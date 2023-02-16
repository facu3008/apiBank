package com.ironhack.proyect.finalproyect.controller.impl;
import com.ironhack.proyect.finalproyect.controller.dto.AdminDTO;
import com.ironhack.proyect.finalproyect.controller.interfaces.AdminController;
import com.ironhack.proyect.finalproyect.model.users.AccountHolder;
import com.ironhack.proyect.finalproyect.model.users.Admin;
import com.ironhack.proyect.finalproyect.model.users.User;
import com.ironhack.proyect.finalproyect.repository.users.AdminRepository;
import com.ironhack.proyect.finalproyect.service.interfaces.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminControllerImpl implements AdminController {

    @Autowired
    AdminRepository adminRepository;
    @Autowired
    AdminService adminService;

    @GetMapping("/admin")
    public List<Admin> findAll() {
        return adminRepository.findAll();
    }


    @GetMapping("/admin/{id}")
    public Admin findById(@PathVariable Long id) {
        return adminRepository.findById(id).get();
    }

    @PostMapping("/admin")
    @ResponseStatus(HttpStatus.CREATED)
    public AdminDTO store(@RequestBody @Valid AdminDTO adminDTO) {
        return adminService.saveAdmin(adminDTO);
    }







//    @Autowired
//    private AdminService adminService;
//
//    @GetMapping("/admin")
//    public List<Admin> getAdmins() {
//        return adminService.getAdmins();
//    }
//    @GetMapping("/admin/{adminId}")
//    public Admin getAdminById(@PathVariable(name = "adminId") Long id) {
//        //System.out.println(authentication.getName());
//        //System.out.println(authentication.getCredentials());
//        return adminService.getAdminById(id);
//    }
//
//    @PostMapping("admin")
//    @ResponseStatus(HttpStatus.CREATED)
//    public void saveAdmin(@RequestBody Admin admin) {
//        adminService.saveAdmin(admin);
//
//
//    }
//
//    @DeleteMapping("/admin/{adminId}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteAdmin(@PathVariable Long adminId) {
//        System.out.println("entro controller");
//        adminService.deleteAdmin(adminId);
//    }
}
