package org.example.ex29;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void seventyTwoRule() {
        String in = "0 ABC 4";
        InputStream stream = new ByteArrayInputStream(in.getBytes(StandardCharsets.UTF_8));
        int out;
        out = App.seventyTwoRule(stream);
        assertEquals(18, out);
    }
}