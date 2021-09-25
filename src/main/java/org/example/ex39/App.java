package org.example.ex39;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App {
    public static void main(String[] args)
    {
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
        List = Sort(List);
        Map<Integer, String> finame = List.get(0);
        Map<Integer, String> laname = List.get(1);
        Map<Integer, String> positions = List.get(2);
        Map<Integer, String> sepdates = List.get(3);
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");
        System.out.println(finame.get(1) + " " + laname.get(1) + "   | " + positions.get(1) + "               |" + sepdates.get(1));
        System.out.println(finame.get(2) + " " + laname.get(2) + "       | " + positions.get(2) + "        |" + sepdates.get(2));
        System.out.println(finame.get(3) + " " + laname.get(3) + "        | " + positions.get(3) + "           | " + sepdates.get(3));
        System.out.println(finame.get(4) + " " + laname.get(4) + " | " + positions.get(4) + "  | " + sepdates.get(4));
        System.out.println(finame.get(5) + " " + laname.get(5) + "        | " + positions.get(5) + "     | " + sepdates.get(5));
        System.out.println(finame.get(6) + " " + laname.get(6) + "           | " + positions.get(6) + " | " + sepdates.get(6));
    }

    public static ArrayList<Map> Sort(ArrayList<Map> List)
    {
        Map<Integer, String> fname = List.get(0);
        Map<Integer, String> lname = List.get(1);
        Map<Integer, String> position = List.get(2);
        Map<Integer, String> sepdate = List.get(3);
        ArrayList<Map> sorted = new ArrayList<Map>(4);
        for(int i = 1; i <= 6; i++){
            for(int j = (i+1); j <= 6; j++)
            if( lname.get(i).compareTo(lname.get(j)) > 0){
                String fn = fname.get(i);
                fname.put(i, fname.get(j));
                fname.put(j, fn);
                String ln = lname.get(i);
                lname.put(i, lname.get(j));
                lname.put(j, ln);
                String pos = position.get(i);
                position.put(i, position.get(j));
                position.put(j, pos);
                String sep = sepdate.get(i);
                sepdate.put(i, sepdate.get(j));
                sepdate.put(j, sep);
            }
        }
        sorted.add(fname);
        sorted.add(lname);
        sorted.add(position);
        sorted.add(sepdate);

        return sorted;
    }

}
