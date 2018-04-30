package com.stayasleep.ch04;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        int count, number;
        System.out.println("Please enter a positive integer: ");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();

        //set loop conditions
        count = 1;
        do{
            System.out.print(count + ", ");
            count++;
        } while (count <= number);
        //want to start on a new print line
        System.out.println();
        System.out.println("buckle my shoeeeee");
    }
}
