package org.example.ex32;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args)
    {
        game();
    }
    public static void game()
    {
        Scanner input = new Scanner(System.in);
        boolean play = true;
        char again;
        System.out.println("Let's play Guess the Number!");
        while(play) {
            System.out.print("Enter the difficulty level (1, 2, or 3):");
            Random random = new Random();
            int int_random = 0;
            int difficulty = input.nextInt();
            int g = 0;
            int guess;
            if(difficulty == 1){
                int_random = random.nextInt(10);
            }else if(difficulty == 2){
                int_random = random.nextInt(100);
            }else if(difficulty == 3){
                int_random = random.nextInt(1000);
            }
            System.out.print("I have my number. What's your guess? ");
            boolean gameover = false;
            int t;
            while( !gameover ) {
                while( !input.hasNextInt() ){
                    System.out.println("Invalid. Please enter a number:");
                    input.next();
                }
                t = input.nextInt();
                guess = test(int_random, t);
                if (guess == 0) {
                    System.out.print("Too low. Guess again: ");
                    g++;
                } else if (guess == 1) {
                    System.out.print("Too high. Guess again: ");
                    g++;
                }else if( guess == 2){
                    g++;
                    System.out.println("You got it in " + g + " guesses!");
                    gameover = true;
                }
            }

            System.out.print("Do you wish to play again (Y/N)?");
            again = input.next().charAt(0);
            if(again == 78 || again == 110){
                play = false;
            }
        }
    }
    public static int test(int rand, int guess){
        int ret = 0;
        if(guess > rand)
            ret = 1;
        if(guess == rand)
            ret = 2;
        return ret;
    }


}
