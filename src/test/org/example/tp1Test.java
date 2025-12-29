package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class tp1Test {

    @Test
    public void testCalculerAgeFuture() {
        // On teste la méthode calculerAgeFuture de tp1
        int resultat = tp1.calculerAgeFuture(20);
        assertEquals(30, resultat); // le résultat attendu est 30
    }
}
