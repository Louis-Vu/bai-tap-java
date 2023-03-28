package com.staff;

import java.util.Scanner;
import java.util.Stack;

public class Staff {
    private String name;
    private String email;
    private int salary;

    public int getSalary() {
        return salary;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        name = scanner.nextLine();
        System.out.print("Input email: ");
        email = scanner.nextLine();
        System.out.print("Input salary: ");
        salary = Integer.parseInt(scanner.nextLine());
    }

    public void display() {
        System.out.printf("Name = %s, email = %s, salary = $%d", name, email, salary);
    }




}
