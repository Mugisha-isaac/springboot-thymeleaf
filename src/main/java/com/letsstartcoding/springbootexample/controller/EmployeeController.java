package com.letsstartcoding.springbootexample.controller;

import com.letsstartcoding.springbootexample.model.Employee;
import com.letsstartcoding.springbootexample.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model){

        //create model attribute to bind form data
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        // save employee to database
        employeeService.save(employee);
        return "redirect:/";
    }
}
