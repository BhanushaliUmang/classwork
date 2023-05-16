package com.example.mapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapping.dao.CourseRepo;
import com.example.mapping.model.Course;
@Service
public class CourseService {

    @Autowired
    CourseRepo courseRepo;



    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public Iterable<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public void deleteCourse(Long courseId) {
        courseRepo.deleteById(courseId);
    }
    
}
