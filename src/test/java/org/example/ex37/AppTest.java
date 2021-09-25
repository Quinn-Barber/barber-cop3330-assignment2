package org.example.ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void password() {
        int len, spc, num;
        len = 8;
        spc = 2;
        num = 2;
        String pass = App.password(len, spc, num);
        assertEquals(len, pass.length());
        int test = 0;
        for(int i = 0; i < pass.length(); i++){
            if( Character.isDigit(pass.charAt(i)) ){
                test++;
            }
        }
        assertEquals(num, test);
    }
}