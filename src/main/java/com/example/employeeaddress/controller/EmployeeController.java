package com.example.employeeaddress.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeeaddress.dao.EmployeeRepository;
import com.example.employeeaddress.model.Employee;

import jakarta.transaction.Transactional;

@RestController
public class EmployeeController {
    

    @Autowired 
    EmployeeRepository employeeRepository;

    @PostMapping(value = "/addEmployee")
    public String addEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "added";
    }

    @GetMapping(value = "/getAllEmployee")
    public Iterable<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/getEmployeeById/{employeeId}")
    public Optional<Employee> getEmployeeById(@PathVariable Long employeeId){
        return employeeRepository.findById(employeeId);
    }

    @DeleteMapping(value = "/deleteEmployee/{employeeId}")
    public String deleteEmployeeById(@PathVariable Long employeeId){
        employeeRepository.deleteById(employeeId);
        return "deleted";
    }

    @Transactional
    @PutMapping(value = "/updateEmployee/{employeeId}")
    public void updateEmployeeById(@PathVariable Long employeeId, @RequestBody Employee employee)
    {
        employeeRepository.updateEmployeeById(employeeId, employee.getFirstName(), employee.getLastName(), employee.getAddress());
    }

}
