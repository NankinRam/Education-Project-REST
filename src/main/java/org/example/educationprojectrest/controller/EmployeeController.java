package org.example.educationprojectrest.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.educationprojectrest.entity.Employee;
import org.example.educationprojectrest.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Tag(name = "Сотрудники", description = "Управляет сотрудниками")
@RestController
@RequestMapping("/emp")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;


    @GetMapping("/{id}")
    @Operation(summary = "Получить пользователя", description = "Позволяет получить пользователя по его ID")
    public Optional<Employee> getEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }
}
