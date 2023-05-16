package com.example.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.model.Student;
import com.example.mapping.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "success";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
        }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudent(studentId);
        return "success";
        }

        // @PutMapping("/{id}")
        // public void updateLaptop(@PathVariable Long id, @RequestBody Student updatedStudent) {
        //     Student student = studentService.getLaptopById(id);
            
        //     student.setStudentName(updatedStudent.getStudentName());
        //     student.setStudentAge(updatedStudent.getStudentAge());
        //     student.getStudentPhoneNumber(updatedStudent.getStudentPhoneNumber());

            

    
        //         Student updatedLaptopEntity = laptopService.updateLaptop(laptop);
        //     }

}
