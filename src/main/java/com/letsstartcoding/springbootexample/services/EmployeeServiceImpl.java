package com.letsstartcoding.springbootexample.services;

import com.letsstartcoding.springbootexample.model.Employee;
import com.letsstartcoding.springbootexample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Employee getById(long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;

        if(optional.isPresent()){
            employee = optional.get();
        }
        else{
            throw  new RuntimeException("Employee Not Found");
        }
        return  employee;
    }

    @Override
    public void deleteById(long id) {
        this.employeeRepository.deleteById(id);
    }
}
