package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tp1Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testCalculerAgeFuture() {
        assertEquals(20, tp1.calculerAgeFuture(10));
        assertEquals(35, tp1.calculerAgeFuture(25));
        assertEquals(10, tp1.calculerAgeFuture(0));
    }
}