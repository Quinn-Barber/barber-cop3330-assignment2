package org.example.ex40;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Map<Integer, String> fname = new HashMap();
        fname.put(1, "John");
        fname.put(2, "Tou");
        fname.put(3, "Michaela");
        fname.put(4, "Jake");
        fname.put(5, "Jacquelyn");
        fname.put(6, "Sally");
        Map<Integer, String> lname = new HashMap();
        lname.put(1, "Johnson");
        lname.put(2, "Xiong");
        lname.put(3, "Michaelson");
        lname.put(4, "Jacobson");
        lname.put(5, "Jackson");
        lname.put(6, "Webber");
        Map<Integer, String> position = new HashMap();
        position.put(1, "Manager");
        position.put(2, "Software Engineer");
        position.put(3, "District Manager");
        position.put(4, "Programmer");
        position.put(5, "DBA");
        position.put(6, "Web Developer");
        Map<Integer, String> sepdate = new HashMap();
        sepdate.put(1, "2016-12-31");
        sepdate.put(2, "2016-10-05");
        sepdate.put(3, "2015-12-19");
        sepdate.put(4, "");
        sepdate.put(5, "");
        sepdate.put(6, "2015-12-18");
        ArrayList<Map> List = new ArrayList<>(4);
        List.add(fname);
        List.add(lname);
        List.add(position);
        List.add(sepdate);
        System.out.print("Enter a search string: ");
        String query = input.nextLine();
        int[] print = search(query, List);
        System.out.println("Results:");
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        for(int i = 0; i < 6; i++){
            switch(print[i]){
                case 1:
                    System.out.println(fname.get(1) + " " + lname.get(1) + "        | " + position.get(1) + "           | " + sepdate.get(1));
                    break;
                case 2:
                    System.out.println(fname.get(2) + " " + lname.get(2) + "           | " + position.get(2) + " | " + sepdate.get(2));
                    break;
                case 3:
                    System.out.println(fname.get(3) + " " + lname.get(3) + " | " + position.get(3) + "  | " + sepdate.get(3));
                    break;
                case 4:
                    System.out.println(fname.get(4) + " " + lname.get(4) + "       | " + position.get(4) + "        |" + sepdate.get(4));
                    break;
                case 5:
                    System.out.println(fname.get(5) + " " + lname.get(5) + "   | " + position.get(5) + "               |" + sepdate.get(5));
                    break;
                case 6:
                    System.out.println(fname.get(6) + " " + lname.get(6) + "        | " + position.get(6) + "     | " + sepdate.get(6));
                    break;
            }
        }


    }
    public static int[] search(String query, ArrayList<Map> List)
    {
        Map<Integer, String> fname = List.get(0);
        Map<Integer, String> lname = List.get(1);
        int[] print = new int[6];
        int j = 0;
        for(int i = 1; i <= 6; i++){
            if(fname.get(i).contains(query) || lname.get(i).contains(query)){
                print[j] = (i);
                j++;
            }
        }


        return print;
    }
}
