package org.example.ex27;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name:");
        String fn = input.nextLine();
        System.out.println("Enter the last name:");
        String ln = input.nextLine();
        System.out.println("Enter the ZIP code:");
        String zip = input.nextLine();
        System.out.println("Enter the employee ID:");
        String eid = input.nextLine();
        int test = validateInput(fn, ln, zip, eid);
        if(test == 0)
            System.out.println("There were no errors found.");
    }
    public static int validateInput(String fn, String ln, String zip, String eid)
    {
        String[] outputs = new String[6];
        int error = 0;
        int test;
        test = validateFn(fn);
        switch(test){
            case 0:
                break;
            case 1:
                error++;
                outputs[0] = "The first name must be at least 2 characters long.";
                break;
            case 2:
                error++;
                outputs[0] = "The first name must be at least 2 characters long.";
                outputs[2] = "The first name must be filled in.";
        }
        test = validateLn(ln);
        switch(test){
            case 0:
                break;
            case 1:
                error++;
                outputs[1] = "The last name must be at least 2 characters long.";
                break;
            case 2:
                error++;
                outputs[1] = "The last name must be at least 2 characters long.";
                outputs[3] = "The last name must be filled in.";
        }
        test = validateEid(eid);
        if(test == 1){
            error++;
            outputs[4] = "The employee ID must be in the format of AA-1234.";
        }
        test = validateZip(zip);
        if(test == 1){
            error++;
            outputs[5] = "The zipcode must be a 5 digit number.";
        }
        for(int i = 0; i < 6; i++){
            if(outputs[i] == null)
                continue;
            System.out.println(outputs[i]);
        }
        return error;
    }

    public static int validateFn(String fn)
    {
        int ret = 0;
        if( fn.length() < 2 ){
            ret++;
        }
        if( fn.length() == 0){
            ret++;
        }
        return ret;
    }

    public static int validateLn(String ln)
    {
        int ret = 0;
        if( ln.length() < 2 ){
            ret++;
        }
        if( ln.length() == 0){
            ret++;
        }
        return ret;
    }

    public static int validateZip(String zip)
    {
        if(zip.length() != 5)
            return 1;
        for(int i = 0; i < zip.length(); i++)
            if( Character.isLetter(zip.charAt(i)) )
                return 1;

        return 0;
    }

    public static int validateEid(String eid)
    {
        if( eid.length() != 7 )
            return 1;
        for(int i = 0; i < 2; i++)
            if( !Character.isLetter(eid.charAt(i)) )
                return 1;
        if( eid.charAt(2) != 45 )
            return 1;

        for(int i = 3; i < 7; i++)
            if( !Character.isDigit(eid.charAt(i)) )
                return 1;

        return 0;
    }
}