package org.example.ex29;
import java.io.InputStream;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */

public class App {
    public static void main(String[] args){
        int years = seventyTwoRule(System.in);
        System.out.println("It will take " + years + " years to double your initial investment.");
    }

    public static int seventyTwoRule(InputStream inp){
        Scanner input = new Scanner(inp);
        int in = 0;
        while(in == 0){
            System.out.println("What is the rate of return?");
            if( !input.hasNextInt() ) {
                System.out.println("Sorry. That's not a valid input.");
                input.next();
                continue;
            }
            in = input.nextInt();
            if(in == 0)
                System.out.println("Sorry. Zero is not a valid input");
        }
        return 72 / in;
    }

}