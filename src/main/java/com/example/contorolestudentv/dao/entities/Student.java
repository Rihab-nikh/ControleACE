package com.example.contorolestudentv.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder(builderClassName = "Builder", toBuilder = true)
public class Student {
    @Id
    @GeneratedValue
    Long id_Student;
    String name;
    String email;
    String dateDeNaissance;

}
