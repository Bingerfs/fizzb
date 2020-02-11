import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {


   /* @Test
    void testFizzbuzz() {
        Program program = new Program();
        assertEquals(true, program.fizzbuzz());
    }*/

    @Test
    void testVerificarNumeroParaNumero() {
        Program program = new Program();
        assertEquals(1, program.verificarNumero(1));
    }

    @Test
    void testVerificarNumeroParaFizz() {
        Program program = new Program();
        assertEquals("Fizz", program.verificarNumero(3));
    }

    @Test
    void testVerificarNumeroParaBuzz() {
        Program program = new Program();
        assertEquals("Buzz", program.verificarNumero(5));
    }

    @Test
    void testVerificarNumeroParaFizzBuzz() {
        Program program = new Program();
        assertEquals("FizzBuzz", program.verificarNumero(90));
    }
}