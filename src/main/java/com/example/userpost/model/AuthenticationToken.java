package com.example.userpost.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

// import jakarta.persistence.Column;
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
// @AllArgsConstructor
@NoArgsConstructor
@Table
public class AuthenticationToken {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private LocalDateTime time;
    
    private String token;
    
    private LocalDate tokenCreationDate;
    
    @OneToOne
    @JoinColumn(nullable = false,name = "fk_user_id")
    private User user;

    public AuthenticationToken(User user) {
        this.user = user;
        this.tokenCreationDate = LocalDate.now();
        this.token = UUID.randomUUID().toString();
    }
}
