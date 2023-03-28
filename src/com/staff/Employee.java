package com.staff;

import java.util.Scanner;

public class Employee extends Staff {
    private String skill;

    @Override
    public void input() {
        super.input();
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Input skill: ");
        skill = newScanner.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(", skill = %s", skill);
    }
}
