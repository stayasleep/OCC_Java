package com.stayasleep.ch03;
import java.util.Scanner;

public class TestStrings {
    public static void main(String[] args){
        String s1, s2;
        System.out.println("Please print two strings of line to be tested \n for equality");
        Scanner keyboard = new Scanner(System.in);

        //grab the two strings
        s1 = keyboard.nextLine();
        s2 = keyboard.nextLine();
        System.out.println("One moment while we test ...");
        if(s1.equals(s2)){
            System.out.println("Both strings are exactly equal!");
        }else if (s1.equalsIgnoreCase(s2)){
            System.out.println("Both strings are equal, ignoring casing");
        }else{
            System.out.println("Sorry, the 2 strings are not equal to each other.");
        }
    }
}
