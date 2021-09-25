package org.example.ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void rand() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Homer");
        arr.add("Bart");
        arr.add("Maggie");
        arr.add("Lisa");
        arr.add("Moe");
        String test = App.rand(arr, 5);
        assertNotEquals("", test);
        assertNotEquals(null, test);
    }
}