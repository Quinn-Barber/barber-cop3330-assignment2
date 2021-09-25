package org.example.ex28;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void adding() {
        String in = "1 2 3 4 5";
        InputStream stream = new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8));
        int out;
        out = App.adding(stream);
        assertEquals(15, out);
    }
}