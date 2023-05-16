package com.example.mapping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Student {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long studentId;
private String studentName;
private String studentAge;
private String studentPhoneNumber;
private String studentBranch;
private String studentDepartment;

@OneToOne
@JoinColumn(name = "fk_addressId")
private Address address;


}
