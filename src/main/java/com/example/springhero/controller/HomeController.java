package com.example.springhero.controller;

import com.example.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public Employee getIndex()
    {
        Employee employee = new Employee(1,"ha hahaha");
        return employee;

    }
}
