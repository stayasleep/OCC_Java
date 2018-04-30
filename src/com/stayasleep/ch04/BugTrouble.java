package com.stayasleep.ch04;
import java.util.Scanner;

public class BugTrouble {
    //declare constants provided
    public static final double BUG_GROWTH_RATE = 0.95;//95% weekly growth
    public static final double BUG_VOLUME = 0.002;// feet cubed

    public static void main(String[] args){
        System.out.println("enter the length, width, and height of your house in feet: ");
        int width, height, length;

        Scanner keyboard = new Scanner(System.in);
        length = keyboard.nextInt();
        width = keyboard.nextInt();
        height = keyboard.nextInt();

        double houseVolume = length * width * height;
        System.out.println("House has a total volume of: "+houseVolume);
        System.out.println("Given a single roach has a volume of "+BUG_VOLUME);
        int initial;
        System.out.println("And given an initial roach population of: ");
        //keep initial population for refernece
        initial = keyboard.nextInt();

        double population = initial;
        int weekCounter = 0;
        //original bug vol
        double totalBugVolume = initial* BUG_VOLUME;
        //new bug numbers
        double newBugPopulation, newBugVolume;
        //do da loopity loop
        while(totalBugVolume < houseVolume){
            weekCounter++;
            //new roach population
            newBugPopulation = population * BUG_GROWTH_RATE;
            population = newBugPopulation + population;
            //new volume
            newBugVolume = newBugPopulation * BUG_VOLUME;
            totalBugVolume += newBugVolume;

        }
        System.out.println("House will be full of roaches by the end of week "+ weekCounter);

    }
}
