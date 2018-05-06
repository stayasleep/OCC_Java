package com.stayasleep.ch07;
import java.util.Scanner;
/**
 * Reads 7 temps from the user and displays which are above/below the 7 day average
 * */
public class ArrayOfTemps {
    public static void main(String[] args){
        //initialize array

        System.out.println("How many temps do you want to enter? ");
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        System.out.println("Enter the temps for the " +size+ " day forecast: ");

        double[] temperature = new double[size];
        double sum=0;

        for(int index=0; index<temperature.length;index++){
            int temp = keyboard.nextInt();
            System.out.println("Temperature "+index+1+" is: "+temp);
            temperature[index] = temp;
            sum = sum + temp;
        }
        double avg = sum/temperature.length;
        System.out.println("The 7 day average is: "+avg);
        //determine who is above or below it
        int aboveAvg=0;
        int below=0;
        for(int j=0;j<7;j++){
            if(temperature[j] > avg){
                aboveAvg++;
            }else{
                below++;
            }
        }
        System.out.println("There are "+aboveAvg+" days with above average temperatures.");
        System.out.println("And there are "+below+" days with temperatures at or below average.");
    }
}
