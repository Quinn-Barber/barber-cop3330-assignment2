package org.example.ex26;
import java.util.*;
import static java.lang.Math.log;
import static java.lang.Math.pow;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App
{
    public static void main( String[] args )
    {
        PaymentCalculator calc = new PaymentCalculator();
        double i, b, p;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance?");
        b = input.nextDouble();
        System.out.println("What is the APR on the card (as a percent)?");
        i = input.nextDouble();
        i = i / 36500;
        System.out.println("What is the monthly payment you can make?");
        p = input.nextDouble();
        n = calc.calculateMonthsUntilPaidOff(i, b, p);
        System.out.println("It will take you " + n + " months to pay off this card.");
    }

}

class PaymentCalculator
{
    public int calculateMonthsUntilPaidOff(double i, double b, double p){
        double n =  (-1.0/30.0) * log(1.0 + (b/p) * (1.0 - pow((1.0+i), 30.0) )) / log(1.0 + i);
        return (int) Math.ceil(n);
    }
}