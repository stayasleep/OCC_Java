package com.stayasleep.ch02;
import java.util.Scanner;

public class VendingMachine {
    static int amount,
        originalAmount,
        quarters,
        dimes,
        nickels,
        pennies;

    public static void main(String[] args){
        //ask user input
        System.out.println("Enter an amount from 1-99 inclusively");
        System.out.println("I will return your amount equal to a combination of spare change!");
        Scanner keyboard = new Scanner(System.in);

        amount = keyboard.nextInt();//reference we will keep mutating
        originalAmount = amount; //reference to spit at the end

        //find how many quarter go into it, and then update amount less quarters taken
        quarters = amount / 25; //int will give whole #
        amount = amount % 25; //updated value

        dimes = amount / 10;
        amount = amount % 10;

        nickels = amount / 5;
        amount = amount % 5;

        pennies = amount;

        System.out.println("Given a total of "+ originalAmount);
        System.out.println("You can make a combination of ...");
        System.out.println(quarters+" Quarters, "+ dimes+ " Dimes, "+nickels+" Nickels, "+pennies+" Pennies.");

    }
}
