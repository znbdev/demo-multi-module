package com.example.demo.controller;

import com.example.demo.db.entity.EmployeeTbl;
import com.example.demo.service.AppService;
import com.example.demo.service.DemoService;
import com.example.demo.service.MyService;
import com.example.demo.utils.DemoUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class DemoApiController {
    private final AppService appService;
    private final MyService myService;
    private final DemoService demoService;

    @GetMapping("/app/info")
    public String appInfo() {
        return appService.getAppInfo();
    }

    @GetMapping("/msg")
    public String msg() {
        return myService.message();
    }

    @GetMapping("/EmployeeTbl")
    public List<EmployeeTbl> getAllEmployee() {
        List<EmployeeTbl> employeeTblList = demoService.getEmployeeName();
        log.info("employeeTblList size: {}", employeeTblList.size());
        return employeeTblList;
    }

    @GetMapping("/EmployeeTbl/create")
    public EmployeeTbl createEmployee() {
        EmployeeTbl employeeTbl = demoService.saveEmployee(createEmployeeData());
        log.info("EmployeeTbl created: {}", employeeTbl);
        return employeeTbl;
    }

    private EmployeeTbl createEmployeeData() {
        EmployeeTbl employeeTbl = new EmployeeTbl();
        employeeTbl.setName(DemoUtil.generateRandomValue());
        employeeTbl.setDepartment("IT");
        return employeeTbl;
    }

}
