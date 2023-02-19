package com.ironhack.proyect.finalproyect.service.impl;

import com.ironhack.proyect.finalproyect.model.accounts.Checking;
import com.ironhack.proyect.finalproyect.model.accounts.Student;
import com.ironhack.proyect.finalproyect.repository.accounts.CheckingRepository;
import com.ironhack.proyect.finalproyect.repository.accounts.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getStudentAccounts() {
        return studentRepository.findAll();
    }
}
