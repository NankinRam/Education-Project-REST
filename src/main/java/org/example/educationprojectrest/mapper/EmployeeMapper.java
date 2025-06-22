package org.example.educationprojectrest.mapper;

import org.example.educationprojectrest.dto.EmployeeDto;
import org.example.educationprojectrest.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "gender", target = "gender")
    @Mapping(source = "birthDate", target = "birthDate")
    @Mapping(source = "hireDate", target = "hireDate")
    EmployeeDto toDto(Employee entity);

    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "gender", target = "gender")
    @Mapping(source = "birthDate", target = "birthDate")
    @Mapping(source = "hireDate", target = "hireDate")
    Employee toEntity(EmployeeDto dto);

    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    @Mapping(source = "gender", target = "gender")
    @Mapping(source = "birthDate", target = "birthDate")
    @Mapping(source = "hireDate", target = "hireDate")
    void update(@MappingTarget Employee emp, EmployeeDto dto);
}
