import org.junit.jupiter.pi.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Validarprimotest {

        @Test
        public void testUnoEsPrimo(){
        assertFalse(ValidadorPrimo.esPrimo(1));

    }

        @Test
        public void testDosEsPrimo(){
        assertTrue(ValidadorPrimo.esPrimo(2));

    }

        @Test
        public void testCincoEsPrimo(){
        assertTrue(ValidadorPrimo.esPrimo(5));

    }

         @Test
        public void testSeisEsPrimo(){
        assertTrue(ValidadorPrimo.esPrimo(6));

    }

             @Test
        public void testSieteEsPrimo(){
        assertTrue(ValidadorPrimo.esPrimo(7));

    }


}