package com.example.universityevent.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.universityevent.model.Event;

@Repository
public interface EventRepo extends CrudRepository<Event,Long>{
    
    public List<Event> findByDate(String date);
}
