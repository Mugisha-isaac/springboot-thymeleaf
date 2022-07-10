package com.letsstartcoding.springbootexample.services;

import com.letsstartcoding.springbootexample.model.Employee;
import com.letsstartcoding.springbootexample.model.User;
import com.letsstartcoding.springbootexample.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> getALl();
    void save(Employee employee);
    Employee getById(long id);
    void deleteById(long id);

}
