package com.stayasleep.ch03;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        int pounds, feet, inches;
        double heightMeters, mass, BMI;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your weights in lbs: ");
        pounds = keyboard.nextInt();

        System.out.println("Enter your height in feet \n followed by a space and then additional inches: ");
        feet = keyboard.nextInt();
        inches = keyboard.nextInt();

        heightMeters = ((feet * 12) + inches) * 0.0254;
        mass = pounds / 2.2;
        BMI = mass / (heightMeters * heightMeters);

        System.out.println("Your BMI is: "+BMI);
        if(BMI < 18.5){
            System.out.println("You are very underweight");
        }else if( BMI < 25){
            System.out.println("Congrats on being normal");
        }else if (BMI < 30){
            System.out.println("You are very overweight");
        }else{
            System.out.println("You need help.");
        }
    }
}
