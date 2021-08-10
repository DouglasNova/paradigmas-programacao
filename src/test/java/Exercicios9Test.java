import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercicios9Test {


    @Test
    public void somaCaracteresERetorna1110() {
        assertEquals(1110, Exercicios9.getBinario(14));
    }

    @Test
    public void somaCaracteresERetorna1100() {
        assertEquals(1100, Exercicios9.getBinario(12));
    }

    @Test
    public void somaCaracteresERetorna1110111100() {
        assertEquals(1110111100, Exercicios9.getBinario(956));
    }


}
