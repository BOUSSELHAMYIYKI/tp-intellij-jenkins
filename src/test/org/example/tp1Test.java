package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class tp1Test {

    @Test
    void testCalculerAgeFuture() {
        // Test 1
        int result1 = tp1.calculerAgeFuture(10);
        assertEquals(20, result1, "العمر بعد 10 سنوات خصو يكون 20");

        // Test 2
        int result2 = tp1.calculerAgeFuture(25);
        assertEquals(35, result2, "العمر بعد 10 سنوات خصو يكون 35");

        // Test 3
        int result3 = tp1.calculerAgeFuture(0);
        assertEquals(10, result3, "العمر بعد 10 سنوات خصو يكون 10");

        // Test 4
        int result4 = tp1.calculerAgeFuture(-5);
        assertEquals(5, result4, "العمر بعد 10 سنوات خصو يكون 5");
    }
}
