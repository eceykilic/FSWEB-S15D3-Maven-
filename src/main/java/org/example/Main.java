package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "John", "Doe"));
        employees.add(new Employee(2, "Jane", "Doe"));
        employees.add(new Employee(3, "Ece", "Doe"));
        employees.add(new Employee(4, "Johnnie", "Doe"));
        employees.add(new Employee(3, "Ece", "Doe"));

        System.out.println("*********************************");
        System.out.println(findUniques(employees));
        System.out.println(findDuplicates(employees));
        System.out.println(removeDuplicates(employees));

    }

    public static List<Employee> findDuplicates(List<Employee> employeeList){
        List<Employee> unique = new ArrayList<>();
        List<Employee> duplicated = new ArrayList<>();
        for(Employee employee : employeeList){
            if(unique.contains(employee)) duplicated.add(employee);
            else unique.add(employee);
        }
        return duplicated;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> employeeList){
        Map<Integer, Employee> employees= new HashMap<>();
        for(Employee emp : employeeList){
            if(emp!=null) employees.put(emp.getId(), emp);
        }
        return employees;
    }

    public static List<Employee> removeDuplicates(List<Employee> employeeList){
        List<Employee> extra = new ArrayList<>(employeeList);
        extra.removeAll(findDuplicates(employeeList));
        return extra;
    }
}
