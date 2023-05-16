package com.example.mapping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.dao.StudentRepo;
import com.example.mapping.model.Student;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
        
    }

    public void deleteStudent(Long studentId) {
        studentRepo.deleteById(studentId);
    }
    
}
