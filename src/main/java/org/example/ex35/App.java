package org.example.ex35;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        boolean cont = true;
        int i = 0;
        while(cont){
            String test;
            System.out.print("Enter a name: ");
            test = input.nextLine();
            if( test.equals("") ){
                cont = false;
                break;
            }
            arr.add(test);
            i++;
        }
        String print = rand(arr, i);
        System.out.print("The winner is... " + print + ".");
    }

    public static String rand(ArrayList<String> arr, int i)
    {
        Random rand = new Random();
        int num = rand.nextInt(i);
        return arr.get(num);
    }

}
