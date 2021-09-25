package org.example.ex28;
import java.io.InputStream;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */

public class App {
    public static void main(String[] args)
    {
        int sum = adding(System.in);
        System.out.println("The total is " + sum + ".");
    }

    public static int adding(InputStream in){
        int ret = 0;
        Scanner input = new Scanner(in);
        for(int i = 0; i < 5; i++){
            System.out.println("Enter a number:");
            int num = input.nextInt();
            ret += num;
        }
        return ret;
    }

}
