package com.example.universityevent.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.universityevent.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long>{
    
}
