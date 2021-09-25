package org.example.ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void test1() {
        int guess = 500;
        int rand = 600;
        int result;
        result = App.test(rand, guess);
        assertEquals(0, result);
        guess = 700;
        result = App.test(rand, guess);
        assertEquals(1, result);
        guess = 600;
        result = App.test(rand, guess);
        assertEquals(2, result);
    }
}