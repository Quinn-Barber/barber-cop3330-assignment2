package org.example.ex36;
import java.text.DecimalFormat;
import java.util.*;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args)
    {
        DecimalFormat dec = new DecimalFormat("#.##");
        Scanner input = new Scanner(System.in);
        ArrayList<String> in = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int j = 0;
        int b = 0;
        boolean allow;
        while(true) {
            allow = true;
            System.out.print("Enter a number: ");
            in.add(input.nextLine());
            String test = in.get(j);
            if( test.equals("done")){
                break;
            }
            for(int i = 0; i < test.length(); i++ ){
                if( Character.isAlphabetic(test.charAt(i)) ){
                    System.out.println("Invalid Input. Try Again.");
                    allow = false;
                    break;
                }
            }
            if(allow) {
                list.add(Integer.valueOf(test));
                b++;
            }
            j++;
        }
        System.out.print("Numbers: ");
        for(int i = 0; i < b; i++){
            if( i == (b-1) ){
                System.out.println(list.get(i));
                break;
            }
            System.out.print(list.get(i) + ", ");
        }
        double avg, std;
        int max, min;
        max = max(list, b);
        min = min(list , b);
        avg = average(list, b);
        std = std(list, b, avg);
        System.out.println("The average is " + dec.format(avg));
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.println("The standard deviation is " + dec.format(std));


    }

    public static double average(ArrayList<Integer> arr, int size)
    {
        double average = 0;
        for(int i = 0; i < size; i++){
            average += arr.get(i);
        }
        average /= size;
        return average;
    }

    public static int max(ArrayList<Integer> arr, int size)
    {
        int max = arr.get(0);
        for(int i = 0; i < size; i++){
            if( arr.get(i) > max){
                max = arr.get(i);
            }
        }
        return max;
    }

    public static int min(ArrayList<Integer> arr, int size)
    {
        int min = arr.get(0);
        for(int i = 0; i < size; i++){
            if( arr.get(i) < min){
                min = arr.get(i);
            }
        }
        return min;
    }

    public static double std(ArrayList<Integer> arr, int size, double avg)
    {
        double sum = 0;
        for(int i = 0; i < size; i++){
            sum += Math.pow((arr.get(i) - avg), 2);
        }
        sum /= size;
        sum = Math.sqrt(sum);
        return sum;
    }

}
