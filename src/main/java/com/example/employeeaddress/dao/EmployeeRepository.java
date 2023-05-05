package com.example.employeeaddress.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.employeeaddress.model.Address;
import com.example.employeeaddress.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{
    
    @Modifying
    @Query(value = "update employee set first_name = :firstName, last_name= :lastname, address_address_id =:addressId where employee_id = :id",nativeQuery = true)
    void updateEmployeeById(Long id,  String firstName, String lastname, Address addressId);
}
