package com.purna.validations.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "User")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor



public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;


}
