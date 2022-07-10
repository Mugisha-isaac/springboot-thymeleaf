package com.letsstartcoding.springbootexample.services;

import com.letsstartcoding.springbootexample.model.Employee;
import com.letsstartcoding.springbootexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getALl() {
        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
       this.employeeRepository.save(employee);
    }
}
