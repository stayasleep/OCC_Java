package com.stayasleep.ch04;

public class ForDemo {

    public static void main(String[] args){
        int product =1, number;

        for(number=1;number<=10; number++){
            product = product * number;
        }
        System.out.println("product of 1-10 is: "+product);
        System.out.println("and number is "+number);

        //add assertion
        int prod = 1;
        assert prod == 1;
        for(int num=1;num<=10; num++){
            prod = prod * num;
        }
        assert prod == -10; //will raise error when assertions are enabled
        //java -enableassertions YourProgram

        System.out.println("Prod of 1-10 is: "+prod);
//        System.out.println("and num is "+num); //throws an compilation error because num is not in scope outside the loop, undefined
    }
}
