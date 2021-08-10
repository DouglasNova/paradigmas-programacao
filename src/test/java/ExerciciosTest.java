import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExerciciosTest {

    @Test
    public void SeNCincoEntaoRetornaquinze() {
        assertEquals(15, Exercicios.getSoma(5));
    }

    @Test
    public void SeN10EntaoRetorna55() {
        assertEquals(55, Exercicios.getSoma(10));
    }

    @Test
    public void SeN1EntaoRetorna1() {
        assertEquals(1, Exercicios.getSoma(1));
    }

    @Test
    public void SeN0EntaoRetorna0() {
        assertEquals(0, Exercicios.getSoma(0));
    }


    @Test
    public void SeNNegativoEntaoExcecao1() {
        try {
            Exercicios.getSoma(-1);
            assertTrue(false);
        }
        catch (IllegalArgumentException ex) {
            assertEquals("N não pode ser negativo", ex.getMessage());
        }
    }


}
