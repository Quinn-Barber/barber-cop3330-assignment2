package org.example.ex24;
import java.util.*;
import java.lang.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        Scanner input = new Scanner(System.in);
        String first;
        String second;
        System.out.println("Enter the first string:");
        first = input.nextLine();
        System.out.println("Enter the second string:");
        second = input.nextLine();
        int test = isAnagram(first, second);
        if(test == 0 ){
            System.out.println("\"" + first + "\" and \"" + second + "\" are not anagrams.");
            return;
        }
        System.out.println("\"" + first + "\" and \"" + second + "\" are anagrams.");
    }

    public static int isAnagram(String first, String second)
    {
        int c1, c2;
        c1 = c2 = 0;
        for(int i = 0; i < first.length(); i++)
            c1++;

        for(int i = 0; i < second.length(); i++)
            c2++;

        if(c2 != c1)
            return 0;

        int test = 0;

        for(int i = 0; i < c1; i++){
            for(int j = 0; j < c2; j++){
                if( first.charAt(i) == second.charAt(j) ){
                    test = 1;
                    break;
                }
            }
            if(test == 0){
                return 0;
            }
            test = 0;
        }
        return 1;
    }
}