package com.example.mapping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mapping.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long>{
    
}
