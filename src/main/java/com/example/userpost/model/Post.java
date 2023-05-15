package com.example.userpost.model;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, scope = Post.class,property = "postId")
public class Post {
    
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long postId;
  
  private Timestamp createdDate;
  
  private Timestamp updatedDate;
    
  private String postData; 
  
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id")
  private User user;
  
}
