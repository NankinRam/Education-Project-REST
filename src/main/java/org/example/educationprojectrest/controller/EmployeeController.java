package org.example.educationprojectrest.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.example.educationprojectrest.dto.EmployeeDto;
import org.example.educationprojectrest.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Сотрудники", description = "Управляет сотрудниками")
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeDto createEmployee(@RequestBody EmployeeDto dto){
        return employeeService.createEmployee(dto);
    }

    public EmployeeDto deleteEmployee(int id){
        return employeeService.deleteEmployee(id);
    }

    public EmployeeDto updateEmployee(EmployeeDto dto){
        return employeeService.updateEmployee(dto);
    }

    @GetMapping("/emp/{id}")
    @Operation(summary = "Получить сотрудника", description = "Позволяет получить сотрудника по его ID")
    public EmployeeDto getEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }

    @GetMapping("/emp")
    @Operation(summary = "Получить всех сотрудников", description = "Позволяет получить всех сотрудников")
    public List<EmployeeDto> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
}
