package com.t2f2.t2f2webproject.dto.employee;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EmployeeContentDTO {
    private String id;
    private String employeeName;
    private String computerName;
    private String department;
}
