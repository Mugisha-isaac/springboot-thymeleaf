package com.letsstartcoding.springbootexample.controller;

import com.letsstartcoding.springbootexample.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    //listing employees

    @GetMapping("/")
    public String viewHomePage(Model model){
      model.addAttribute("listEmployees",employeeService.getALl());

      return  "index";
    }
}
