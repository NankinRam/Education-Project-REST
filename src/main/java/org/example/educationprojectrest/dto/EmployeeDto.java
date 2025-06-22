package org.example.educationprojectrest.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "Предоставляемая сущность сотрудника")
@Data
public class EmployeeDto {
    @Schema(description = "Имя", example = "Ivan")
    private final String firstName;

    @Schema(description = "Фамилия", example = "Georgov")
    private final String lastName;

    @Schema(description = "Пол (F или M)", example = "M")
    private final Character gender;

    @Schema(description = "Дата рождения", example = "1972-02-19")
    private final String birthDate;

    @Schema(description = "Дата трудоустройства", example = "1998-02-19")
    private final String hireDate;
}
