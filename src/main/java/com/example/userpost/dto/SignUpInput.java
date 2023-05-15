package com.example.userpost.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpInput {
    
    private String userFirstName;
    private String userLastName;
    private String userAge;
    private String userEmail;
    private String userPhoneNumber;
    private String userPassword;
}
