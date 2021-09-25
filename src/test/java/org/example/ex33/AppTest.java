package org.example.ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void eightball() {
        int rand = 0;
        String test = App.eightball(rand);
        assertEquals("Yes", test);
        rand = 1;
        test = App.eightball(rand);
        assertEquals("No", test);
        rand = 2;
        test = App.eightball(rand);
        assertEquals("Maybe", test);
        rand = 3;
        test = App.eightball(rand);
        assertEquals("Ask again later.", test);
    }
}