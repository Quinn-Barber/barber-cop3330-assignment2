package org.example.ex39;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void sort() {
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
        List = App.Sort(List);
        Map<Integer, String> finame = List.get(0);
        assertEquals("Jacquelyn", finame.get(1));
        assertEquals("Jake", finame.get(2));
        assertEquals("John", finame.get(3));
        assertEquals("Michaela", finame.get(4));
        assertEquals("Sally", finame.get(5));
        assertEquals("Tou", finame.get(6));
    }
}