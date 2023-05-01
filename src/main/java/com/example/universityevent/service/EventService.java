package com.example.universityevent.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.universityevent.dao.EventRepo;
import com.example.universityevent.model.Event;

import jakarta.validation.Valid;

@Service
public class EventService {
    
    @Autowired
    EventRepo eventRepo;

    public void addEvent(Event event) {
        eventRepo.save(event);
    }

    public List<Event> getAllEventsByDate(String date) {
        return eventRepo.findByDate(date);
    }

    public void deleteEventById(Long eventId) {
        eventRepo.deleteById(eventId);
    }

    public void updateEventById(Long eventId, @Valid Event event) {
        eventRepo.save(event);
    }
}
