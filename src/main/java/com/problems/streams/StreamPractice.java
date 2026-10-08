package com.problems.streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int age;
    private String gender;

    public Employee(int id, String name, String department,
                    double salary, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + "-" + department + "-" + salary;
    }
}

public class StreamPractice {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Vijay", "IT", 90000, 29, "Male"),
            new Employee(2, "Anil", "IT", 120000, 32, "Male"),
            new Employee(3, "Priya", "HR", 75000, 28, "Female"),
            new Employee(4, "Sneha", "HR", 95000, 31, "Female"),
            new Employee(5, "Ravi", "Finance", 110000, 35, "Male"),
            new Employee(6, "Kiran", "Finance", 85000, 27, "Male"),
            new Employee(7, "Meena", "IT", 130000, 34, "Female"),
            new Employee(8, "Arjun", "Finance", 110000, 30, "Male"),
            new Employee(9, "Divya", "HR", 105000, 33, "Female"),
            new Employee(10, "Rahul", "IT", 120000, 30, "Male")
        );

       //Highest-paid employee in each department
        
        
        Map<String, Employee> map1=employees.stream()
        		.collect(Collectors.groupingBy(
        				Employee::getDepartment,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),op->op.orElse(null)))); 
        
        
        // second highest paid in department;
        
        Map<String, Employee> map2=employees.stream()
        		.collect(Collectors.groupingBy(
        				Employee::getDepartment,
        				Collectors.collectingAndThen(Collectors.toList(), list->list.stream()
        						.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).distinct().skip(1).findFirst().get())));
        
        
        //average
        
        Map<String, Double> map3=employees.stream()
        		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        
        
        //counting
        
        Map<String, Long> map4=employees.stream()
        		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        
        
        //list of employee names for each department
        
        Map<String, List<String>> map5=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toList())));
        
        //Find the highest salary in each department, but return salary only, not Employee.
        
        Map<String, Double> map6=employees.stream()
        		.collect(Collectors.groupingBy(
        				Employee::getDepartment,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),op->op.orElse(new Employee(0, null, null, 0, 0, null)).getSalary()))); 
        
        
        //Partition employees into two groups:
        
        Map<Boolean, List<Employee>> map7=employees.stream()
        		.collect(Collectors.partitioningBy(n->n.getSalary()>=100000));
        
        //Find the number of Male/Female employees in each department.
        
        Map<String, Map<String, Long>> map9=employees.stream()
        		.collect(Collectors.groupingBy(Employee::getDepartment,
        				Collectors.collectingAndThen(Collectors.toList(), list->list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())))));
        
        
        //Find the top 2 highest-paid employees from each department
        Map<String, List<Employee>> map10=employees.stream()
        		.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.collectingAndThen(Collectors.toList(), list->list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2).collect(Collectors.toList()))));
        
    }
    
    
}