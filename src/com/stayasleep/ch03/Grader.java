package com.stayasleep.ch03;
import java.util.Scanner;

public class Grader {

    public static void main(String[] args){
        int score;
        char grade;

        System.out.println("Please enter your exam score: ");

        //retrieve score
        Scanner keyboard = new Scanner(System.in);
        //assign score
        score = keyboard.nextInt();
        //determine score
        if(score >= 90){
            System.out.println("You received an A with a score of "+score);
        }else if(score >= 80){
            System.out.println("You received a B, :|");
        }else if(score >= 70){
            System.out.println("You received a C...");
        } else {
            System.out.println("Please retake the test for a passing score.");
        }
    }
}
