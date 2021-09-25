package org.example.ex38;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String in = input.nextLine();
        char[] ch = new char[in.length()];
        for(int i = 0; i < in.length(); i++){
            ch[i] = in.charAt(i);
        }

        ch = filterEvenNumbers(ch, in.length());
        int newlen = 0;
        for(int i = 0; i < in.length(); i++){
            if(ch[i] == 0){
                break;
            }
            newlen++;
        }
        System.out.print("The even numbers are ");
        for(int i = 0; i < newlen; i++) {
            if(i == (newlen-1)){
                System.out.print(ch[i] + ".");
                break;
            }
            System.out.print(ch[i] + " ");
        }
    }

    public static char[] filterEvenNumbers(char[] ch, int len)
    {
        char[] numbers = new char[len];
        char[] even = new char[len];
        int j = 0;
        for(int i = 0; i < len; i++)
        {
            if(Character.isDigit(ch[i])){
                numbers[j] = ch[i];
                j++;
            }
        }
        int h = 0;
        for( int i = 0; i < j; i++){
            if( numbers[i] % 2 == 0){
                even[h] = numbers[i];
                h++;
            }
        }

        return even;
    }

}
