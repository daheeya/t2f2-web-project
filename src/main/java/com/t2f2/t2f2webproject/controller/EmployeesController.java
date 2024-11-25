package com.t2f2.t2f2webproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/employees")
public class EmployeesController {

//    @GetMapping("")
//    public ResponseEntity<?> getEmployees(
//            @RequestParam int page,
//            @RequestParam(required = false) String sort,
//            @RequestParam(required = false) String employee,
//            @RequestParam(required = false) String department,
//            @RequestParam(required = false) String id,
//            @RequestParam(required = false) String pcName
//    ) {
//        return ResponseEntity.ok(employeesController.getEmployees(page, sort, employee, department, id, pcName));
//    }
//
//    @PostMapping("")
//    public ResponseEntity<?> registerEmployee(@RequestBody EmployeeRequest employeeRequest) {
//        apiService.registerEmployee(employeeRequest);
//        return ResponseEntity.ok(Collections.singletonMap("message", "사원이 성공적으로 등록되었습니다."));
//    }
//
//    @DeleteMapping("/employees/{employeeId}")
//    public ResponseEntity<?> deleteEmployee(@PathVariable Long employeeId) {
//        apiService.deleteEmployee(employeeId);
//        return ResponseEntity.ok(Collections.singletonMap("message", "사원이 성공적으로 삭제되었습니다."));
//    }
}
