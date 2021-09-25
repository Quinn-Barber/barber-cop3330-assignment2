package org.example.ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterEvenNumbers() {
        char[] arr = new char[8];
        arr = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        arr = App.filterEvenNumbers(arr, 8);
        assertEquals('2', arr[0]);
        assertEquals('4', arr[1]);
        assertEquals('6', arr[2]);
        assertEquals('8', arr[3]);
    }
}