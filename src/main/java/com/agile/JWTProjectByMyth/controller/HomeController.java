package com.agile.JWTProjectByMyth.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agile.JWTProjectByMyth.model.Employee;
import com.agile.JWTProjectByMyth.service.EmployeeService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/welcome")
@AllArgsConstructor
@Slf4j
public class HomeController {

    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployeesList() {
        log.info("Get employees list");
        return employeeService.getEmployeesList();
    }
}
