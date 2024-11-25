package com.t2f2.t2f2webproject.dto.employee;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class EmployeeRequestDTO {
    private String employeeName;
    private String computerName;
    private String department;
    private String id;
}
