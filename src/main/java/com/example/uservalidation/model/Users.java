package com.example.uservalidation.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    
    @NotNull
    private String id;

    @NotNull
    @Size(min = 3, max = 50)
    private String username;

    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "Date of birth should be in the format yyyy-MM-dd")
    private String dateOfBirth;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Pattern(regexp="^\\+\\d{2}-\\d{10}$", message = "example=> +91-9876543210")
    private String phoneNumber;

}
