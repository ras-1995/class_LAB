package com.bnta.assignment;


import java.util.ArrayList;

public class Employee {
    public static ArrayList<Employee> employee = new ArrayList<>();
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return firstname + lastname;
    }

    public int getAnnualSalary() {
        return 12 * salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
}