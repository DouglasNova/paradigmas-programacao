import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercicios6Test {

    @Test
    public void EuclideERetorna18() {
        assertEquals(18, Exercicios6.getAlgoritimoEuclides(90, 54));
    }

    @Test
    public void EuclideERetorna12() {
        assertEquals(12, Exercicios6.getAlgoritimoEuclides(348, 156));
    }

    @Test
    public void EuclideERetornaExcessao() {
        try {
            Exercicios6.getAlgoritimoEuclides(91, 54);
            assertTrue(false);
        }
        catch (IllegalArgumentException ex) {
            assertEquals("Numero invalidos", ex.getMessage());
        }
    }



}
