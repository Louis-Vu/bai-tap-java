package com.staff;


import java.util.Scanner;

public class Director extends Staff {
    private String roll;

    @Override
    public void input() {
        Scanner newScanner = new Scanner(System.in);
        super.input();
        System.out.print("Input roll: ");
        roll = newScanner.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(", roll = %s", roll);
    }
}


