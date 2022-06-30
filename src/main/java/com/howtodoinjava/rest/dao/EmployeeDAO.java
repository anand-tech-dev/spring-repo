package com.howtodoinjava.rest.dao;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.rest.model.Employee;
import com.howtodoinjava.rest.model.Employees;

import java.util.Optional;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Anand", "Rajasekar", "rajasekaran.anand@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }

    public Employee getEmployeeByName(String employeeName)
    {
        return list.getEmployeeList().stream().filter(employee -> employee.getLastName().equals(employeeName)).findFirst().get();
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
