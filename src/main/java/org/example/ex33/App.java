package org.example.ex33;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int i = random.nextInt(10);
        i = i % 4;
        System.out.print("What's your question?\n> ");
        input.nextLine();
        String rand = eightball(i);
        System.out.print("\n" + rand);
    }
    public static String eightball(int rand){
        String[] answers = new String[15];
        answers[0] = "Yes";
        answers[1] = "No";
        answers[2] = "Maybe";
        answers[3] = "Ask again later.";
        return answers[rand];
    }
}
