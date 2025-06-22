package org.example.educationprojectrest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
public class Employee {

    @Id
    @Column(name = "emp_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "gender")
    private Character gender;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "hire_date")
    private LocalDate hireDate;
}
