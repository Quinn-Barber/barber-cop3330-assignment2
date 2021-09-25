package org.example.ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void rem() {
        String[] arr = new String[50];
        arr[0] = "John Smith";
        arr[1] = "Jackie Jackson";
        arr[2] = "Chris Jones";
        arr[3] = "Amanda Cullen";
        arr[4] = "Jeremy Goodwin";
        String rem = "Chris Jones";
        arr = App.rem(rem, arr, 5);
        assertEquals("Amanda Cullen", arr[2]);
        assertEquals("", arr[4]);
    }
}