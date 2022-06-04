package com.alexeistanovskii.spring.rest;

import com.alexeistanovskii.spring.rest.configuration.MyConfig;
import com.alexeistanovskii.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",Communication.class );

//        List<Employee> employeeList = communication.getAllEmployees();
//        System.out.println(employeeList);
//
//        Employee employee= communication.getEmployee(2);
//        System.out.println(employee);

//        Employee employee1 = new Employee("Interface", "Extends", "util", 500);
//        employee1.setId(9);
//        communication.saveEmployee(employee1);

        communication.deleteEmployee(9);
    }
}
