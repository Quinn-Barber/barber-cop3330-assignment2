package org.example.ex25;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Enter the password:");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        int strength = passwordValidator(password);
        String out = "";
        switch(strength){
            case 1:
                out = "very weak";
                break;
            case 2:
                out = "weak";
                break;
            case 3:
                out = "strong";
                break;
            case 4:
                out = "very strong";
                break;
        }
        System.out.println("The password '" + password + "' is a " + out + " password.");
    }

    public static int passwordValidator(String pass)
    {
        int let, num, spc;
        let = num = spc = 0;
        if(pass.length() >= 8){
            for(int i = 0; i < pass.length(); i++){
                if(pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
                    num++;
                    continue;
                }
                if(pass.charAt(i) >= 97 && pass.charAt(i) <= 122){
                    //Only lowercase because not specified and all examples are lowercase
                    let++;
                    continue;
                }
                spc++;
            }
        }
        if(let > 0 && num > 0 && spc > 0)
            return 4;
        if(let > 0 && num > 0)
            return 3;

        for(int i = 0; i < pass.length(); i++){
            if(pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
                num++;
                continue;
            }
            if(pass.charAt(i) >= 97 && pass.charAt(i) <= 122){
                let++;
            }
        }
        if( let > 0)
            return 2;
        return 1;
    }
}