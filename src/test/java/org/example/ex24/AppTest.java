package org.example.ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {
    }

    @Test
    void isAnagram() {
        String[] tests = new String[6];
        tests[0] = "first";
        tests[1] = "first ";
        int output = App.isAnagram(tests[0], tests[1]);
        assertEquals(0, output);
        tests[2] = "noted";
        tests[3] = "toner";
        output = App.isAnagram(tests[2], tests[3]);
        assertEquals(0, output);
        tests[4] = "noted";
        tests[5] = "toned";
        output = App.isAnagram(tests[4], tests[5]);
        assertEquals(1, output);
    }
}