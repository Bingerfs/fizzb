import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {


    @Test
    void fizzbuzz() {
        Program program = new Program();
        assertEquals(true, program.fizzbuzz());
    }
}