package org.example.educationprojectrest.service;

import lombok.RequiredArgsConstructor;
import org.example.educationprojectrest.dto.EmployeeDto;
import org.example.educationprojectrest.entity.Employee;
import org.example.educationprojectrest.mapper.EmployeeMapper;
import org.example.educationprojectrest.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeDto createEmployee(EmployeeDto dto){
        return null;
    }

    public EmployeeDto deleteEmployee(int id){
        return null;
    }

    public EmployeeDto updateEmployee(EmployeeDto dto){
        return null;
    }

    public EmployeeDto getEmployee(int id) {
        return employeeMapper.toDto(employeeRepository.findById(id).get());
    }

    public List<EmployeeDto> getAllEmployee(){
        return employeeRepository.findAll().stream().map(employeeMapper::toDto).toList();
    }
}
