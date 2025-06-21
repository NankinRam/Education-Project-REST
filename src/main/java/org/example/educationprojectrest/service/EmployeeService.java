package org.example.educationprojectrest.service;

import lombok.RequiredArgsConstructor;
import org.example.educationprojectrest.entity.Employee;
import org.example.educationprojectrest.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(int id){
        return employeeRepository.findById(id);
    }

}
