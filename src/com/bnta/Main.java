package com.bnta;

import com.bnta.assignment.*;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("abc", "Mufaro", 123);
        Account account1 = new Account("def", "Jishma", 456);
        System.out.println(account);

        Circle circle = new Circle(2.5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getCircumference());

        Rectangle rectangle = new Rectangle(25, 10);
        System.out.println(rectangle.getDiagonal());

        Employee employee = new Employee(12,"Anderson","Maregere",10000);
        System.out.println("£"+ employee.getAnnualSalary());

        Invoice invoice = new Invoice("efg","Waitrose", 25,12.08);
        System.out.println("£"+ invoice.getTotal());

    }
}
