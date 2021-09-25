package org.example.ex37;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int len;
        int spc;
        int num;
        System.out.print("What's the minimum length? ");
        len = input.nextInt();
        System.out.print("How many special characters? ");
        spc = input.nextInt();
        System.out.print("How many numbers? ");
        num = input.nextInt();

        String pass = password(len, spc, num);
        System.out.print("Your password is " + pass);
    }

    public static String password(int len, int spc, int num)
    {
        Random rand = new Random();
        ArrayList<Character> alp = new ArrayList<>();
        ArrayList<Character> spec = new ArrayList<>();
        for( int i = 0; i < 26; i++){
            alp.add((char) ('a' + i));
        }
        for( int i = 0; i < 15; i++){
            spec.add((char) ('!' + i));
        }
        StringBuilder pass = new StringBuilder();
        int let = (num+spc);
        if(len > (let + num + spc))
            let += (len - (let*2) );

        for(int i = 0; i < let; i++){
            int r = rand.nextInt(25);
            pass.append(alp.get(r));
        }

        for(int i = 0; i < spc; i++){
            int r = rand.nextInt(14);
            pass.append(spec.get(r));
        }

        for(int i = 0; i < num; i++){
            int r = rand.nextInt(9);
            pass.append(r);
        }

        return pass.toString();
    }

}
