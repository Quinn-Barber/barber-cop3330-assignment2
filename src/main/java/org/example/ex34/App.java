package org.example.ex34;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args)
    {
        int n = 5;
        Scanner input = new Scanner(System.in);
        String[] arr = new String[50];
        arr[0] = "John Smith";
        arr[1] = "Jackie Jackson";
        arr[2] = "Chris Jones";
        arr[3] = "Amanda Cullen";
        arr[4] = "Jeremy Goodwin";
        System.out.println("There are "+ n + " employees:");
        for(int i = 0; i < n; i++)
            System.out.println(arr[i]);
        System.out.print("\nEnter an employee name to remove: ");
        String remove = input.nextLine();
        arr = rem(remove, arr, n);
        n--;
        System.out.println("\nThere are "+ n + " employees:");
        for(int i = 0; i < n; i++)
            System.out.println(arr[i]);
    }

    public static String[] rem(String name, String[] arr, int n)
    {
        for(int i = 0; i < n; i++){
            if( arr[i].equals(name) ){
                for(int j = i; j < (n-1); j++){
                    arr[j] = arr[j+1];
                }
                arr[n-1] = "";
                return arr;
            }
        }
        return arr;
    }
}
