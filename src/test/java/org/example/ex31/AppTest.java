package org.example.ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calculator() {
        double test, age, intensity, resthr;
        age = 22;
        resthr = 65;
        intensity = 55;
        for(int i = 0; i < 9; i++){
            test = App.calculator(age, resthr, intensity);
            switch(i){
                case 0:
                    assertEquals(138, (int)(Math.round(test)) );
                    break;
                case 1:
                    assertEquals(145, (int)(Math.round(test)) );
                    break;
                case 2:
                    assertEquals(151, (int)(Math.round(test)) );
                    break;
                case 3:
                    assertEquals(158, (int)(Math.round(test)) );
                    break;
                case 4:
                    assertEquals(165, (int)(Math.round(test)) );
                    break;
                case 5:
                    assertEquals(171, (int)(Math.round(test)) );
                    break;
                case 6:
                    assertEquals(178, (int)(Math.round(test)) );
                    break;
                case 7:
                    assertEquals(185, (int)(Math.round(test)) );
                    break;
                case 8:
                    assertEquals(191, (int)(Math.round(test)) );
                    break;
            }
            intensity += 5;
        }
    }
}