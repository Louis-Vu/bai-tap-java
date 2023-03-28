package com.staff;

import java.util.Scanner;

public class Manager extends Staff {
    private String department;
    public void input() {
        super.input();
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Input department: ");
        department = newScanner.nextLine();
    }
    public void display() {
        super.display();
        System.out.printf(", department = %s", department);
    }
}
