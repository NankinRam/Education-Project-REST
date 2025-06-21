package org.example.educationprojectrest.mapper;

import org.example.educationprojectrest.dto.EmployeeDto;
import org.example.educationprojectrest.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDto toDto(Employee entity);
    Employee toEntity(EmployeeDto dto);
}
