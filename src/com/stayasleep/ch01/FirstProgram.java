package com.stayasleep.ch01;

import java.util.Scanner;

public class FirstProgram {

    public static void main(String[] args){
        System.out.println("Hello Stayasleep");
        System.out.println("Let us add two whole numbers together!");
        System.out.println("Enter two numbers on the line below ...");
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();

        System.out.println("Drum roll please...");
        System.out.println(num1+num2);
    }
}
