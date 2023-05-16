package com.example.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.model.Course;
import com.example.mapping.service.CourseService;

@RestController
@RequestMapping("/Course")
public class CourseController {
    

    @Autowired
     CourseService courseService;

     @PostMapping("/add")
     public String addCourse(@RequestBody Course course){
        courseService.addCourse(course);
        return "Course added successfully";
     }

     @GetMapping("/getAll")
     public Iterable<Course> getAllCourses(){
        return courseService.getAllCourses();
        }

    @DeleteMapping("/delete")
    public String deleteCourse(@PathVariable Long courseId){
        courseService.deleteCourse(courseId);
        return "deleted";
    }
}
