package aed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CoberturaTests {
    Cobertura cobertura = new Cobertura();

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz",cobertura.fizzBuzz(15));
        assertEquals("Fizz",cobertura.fizzBuzz(33));
        assertEquals("Buzz",cobertura.fizzBuzz(25));
        assertEquals(String.valueOf(22),cobertura.fizzBuzz(22));
    }

    @Test
    void testNumeroCombinatorio() {
        assertTrue(cobertura.numeroCombinatorio(9, 0)==1);
        assertTrue(cobertura.numeroCombinatorio(9,9)==1);
        assertTrue(cobertura.numeroCombinatorio(2,5)==0);
        assertTrue(cobertura.numeroCombinatorio(5,2)==10);

    }

    @Test
    void testRepeticionesConsecutivas() {
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{})==0);
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{1})==0);
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{1,2})==1);
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{7,7,7,7})==4);
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{7,7,7,3})==3);
        assertTrue(cobertura.repeticionesConsecutivas(new int[]{0,2,7,7})==2);
        assertFalse(cobertura.repeticionesConsecutivas(new int[]{0,1,1,3})!=2);
        assertFalse(cobertura.repeticionesConsecutivas(new int[]{})!=0);
    }
}
