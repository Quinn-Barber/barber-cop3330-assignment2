package org.example.ex31;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args)
    {
        print();
    }

    public static void print()
    {
        Scanner input = new Scanner(System.in);
        boolean valid = true;
        double resthr = 0;
        double age = 0;
        while( valid ) {
            System.out.print("Resting Pulse: ");
            if (!input.hasNextInt()) {
                input.next();
                System.out.println("Invalid, enter a number");
            } else {
                resthr = input.nextInt();
                valid = false;
            }
        }
            valid = true;
            while( valid ) {
                System.out.print("Age: ");
                if( !input.hasNextInt() ){
                    input.next();
                    System.out.println("Invalid, enter a number");
                }
                else{
                    age = input.nextInt();
                    valid = false;
                }
            }
        System.out.println("\nIntensity    | Rate\n-------------|--------");
        double percent = 55.0;
        double bpm;
        for(int i = 0; i < 9; i++){
            bpm = calculator(age, resthr, percent);
            System.out.println( (int) percent + "%          | " + (int) (Math.round(bpm)) + " bpm");
            percent += 5;
        }

    }

    public static double calculator(double age, double resthr, double intensity)
    {
        intensity = intensity / 100.0;
        double TargetHeartRate;
        TargetHeartRate = (220.0 - age);
        TargetHeartRate -= resthr;
        TargetHeartRate *= intensity;
        TargetHeartRate += resthr;
        return TargetHeartRate;
    }

}
