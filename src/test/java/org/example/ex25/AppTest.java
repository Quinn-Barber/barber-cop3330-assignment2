package org.example.ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void main() {
    }

    @Test
    void passwordValidator() {
        String pass;
        pass = "12345";
        int output = App.passwordValidator(pass);
        assertEquals(1, output);
        pass = "abcdef";
        output = App.passwordValidator(pass);
        assertEquals(2, output);
        pass = "abc123xyz";
        output = App.passwordValidator(pass);
        assertEquals(3, output);
        pass = "1337h@xor!";
        output = App.passwordValidator(pass);
        assertEquals(4, output);

    }
}