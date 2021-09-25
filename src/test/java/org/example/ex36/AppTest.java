package org.example.ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void average() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(1000);
        arr.add(300);
        int size = 4;
        double avg = App.average(arr, size);
        assertEquals(400.0, avg);
    }

    @Test
    void max() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(1000);
        arr.add(300);
        int size = 4;
        int max = App.max(arr, size);
        assertEquals(1000, max);
    }

    @Test
    void min() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(1000);
        arr.add(300);
        int size = 4;
        int min = App.min(arr, size);
        assertEquals(100, min);
    }

    @Test
    void std() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(1000);
        arr.add(300);
        int size = 4;
        double avg = 400.0;
        double std = App.std(arr, size, avg);
        assertEquals(353.5533905932738, std);
    }
}