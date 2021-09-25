package org.example.ex30;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean notvalid = true;
        int n = 0;
        while( notvalid ) {
            System.out.println("Enter the number you want to generate a multiplication table for:");
            n = input.nextInt();
            if( n > 31 || n < 0){
                System.out.println("Not valid, enter numbers 0-31");
            }
            else{
                notvalid = false;
            }
        }
        String[] print;
        print = print(n);
        for(int i = 1; i <= n; i++)
            System.out.println(print[i]);
    }

    public static String[] print(int n)
    {
        String[] prnt = new String[250];
        int result;
        for(int i = 1; i <= n; i++){
            if(i >= 100) {
                prnt[i] = "  ";
            }else if( i >= 10) {
                prnt[i] = "   ";
            }else{
                prnt[i] = "    ";
            }
            for(int j = 1; j <= n; j++){
                result = i * j;
                    prnt[i] += result;
                if(j == n)
                    continue;
                if((result+i) > 99){
                    prnt[i] += "  ";
                }
                else if( (result+i) > 9 ){
                    prnt[i] += "   ";
                }
                else{
                    prnt[i] += "    ";
                }
            }
        }

        return prnt;
    }

}
