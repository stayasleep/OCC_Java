package com.stayasleep.ch02;
import java.util.Scanner;


public class EggBasket2 {
    public static void main(String[] args){
        //declare em
        int numberOfBaskets, eggsPerBasket, totalEggs;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter number of eggs per basket:");
        eggsPerBasket = keyboard.nextInt();

        System.out.println("Please enter the number of baskets:");
        numberOfBaskets = keyboard.nextInt();

        totalEggs = eggsPerBasket*numberOfBaskets;
        System.out.println("If Jas has...");
        System.out.println(eggsPerBasket+" eggs per basket, and");
        System.out.println("she has "+numberOfBaskets+" baskets full of eggs");
        System.out.println("Then she has a total of "+totalEggs+" eggs!");
        double tax = totalEggs * 0.10;
        System.out.println("But Uncle Sam gets a 10% cut of all the eggs, or "+tax+" eggs in total");
        double eggsAfterTax = totalEggs - tax;
        System.out.println("Leaving Jas with "+eggsAfterTax+ " eggs!");
    }
}
