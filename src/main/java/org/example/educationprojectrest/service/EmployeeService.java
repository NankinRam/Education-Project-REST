package org.example.educationprojectrest.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.educationprojectrest.dto.EmployeeDto;
import org.example.educationprojectrest.entity.Employee;
import org.example.educationprojectrest.mapper.EmployeeMapper;
import org.example.educationprojectrest.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeDto createEmployee(EmployeeDto dto){
        Employee newEmp = employeeRepository.save(employeeMapper.toEntity(dto));
        employeeRepository.flush();
        return employeeMapper.toDto(newEmp);
    }

    public EmployeeDto deleteEmployee(int id){
        EmployeeDto dto = employeeMapper.toDto(employeeRepository.findById(id).get());
        employeeRepository.deleteById(id);
        return dto;
    }

    public EmployeeDto updateEmployee(int id, EmployeeDto dto){
        Employee employee = employeeRepository.findById(id).get();
        employeeMapper.update(employee, dto);
        employeeRepository.save(employee);
        return employeeMapper.toDto(employee);
    }

    public EmployeeDto getEmployee(int id) {
        return employeeMapper.toDto(employeeRepository.findById(id).get());
    }

    public List<EmployeeDto> getAllEmployee(){
        return employeeRepository.findAll().stream().map(employeeMapper::toDto).toList();
    }
}
