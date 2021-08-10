import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercicios8Test {


    @Test
    public void somaCaracteresERetorna6() {
        assertEquals(6, Exercicios8.getSomaCaracteres(132));
    }

    @Test
    public void somaCaracteresERetorna45() {
        assertEquals(45, Exercicios8.getSomaCaracteres(99999));
    }

    @Test
    public void somaCaracteresERetorna45Negativo() {
        assertEquals(-45, Exercicios8.getSomaCaracteres(-99999));
    }



}
