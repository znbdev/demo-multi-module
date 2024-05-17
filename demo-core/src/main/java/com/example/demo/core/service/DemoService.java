package com.example.demo.core.service;

import com.example.demo.db.entity.EmployeeTbl;
import com.example.demo.db.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DemoService {

    private final EmployeeService employeeService;

    public List<EmployeeTbl> getEmployeeName() {
        return this.employeeService.findAll();
    }

    public EmployeeTbl saveEmployee(EmployeeTbl employee) {
        return this.employeeService.save(employee);
    }
}
