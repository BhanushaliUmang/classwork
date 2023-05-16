package com.example.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{
    
}
