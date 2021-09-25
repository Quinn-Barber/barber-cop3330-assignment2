package org.example.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void validateInput() {
        String fn = "John";
        String ln = "Johnson";
        String zip = "55555";
        String eid = "TK-4321";
        int errors = App.validateInput(fn, ln, zip, eid);
        assertEquals(0, errors);
        fn = "J";
        ln = "";
        zip = "ABCDE";
        eid = "A12-1234";
        errors = App.validateInput(fn, ln, zip, eid);
        assertEquals(4, errors);
    }

    @Test
    void validateFn() {
        String fn = "John";
        int errors = App.validateFn(fn);
        assertEquals(0, errors);
        fn = "J";
        errors = App.validateFn(fn);
        assertEquals(1, errors);
    }

    @Test
    void validateLn() {
        String ln = "Johnson";
        int errors = App.validateLn(ln);
        assertEquals(0, errors);
        ln = "";
        errors = App.validateLn(ln);
        assertEquals(2, errors);
    }

    @Test
    void validateZip() {
        String zip = "55555";
        int errors = App.validateZip(zip);
        assertEquals(0, errors);
        zip = "ABCDE";
        errors = App.validateZip(zip);
        assertEquals(1, errors);
    }

    @Test
    void validateEid() {
        String eid = "TK-4321";
        int errors = App.validateEid(eid);
        assertEquals(0, errors);
        eid = "A12-1234";
        errors = App.validateEid(eid);
        assertEquals(1, errors);
    }
}