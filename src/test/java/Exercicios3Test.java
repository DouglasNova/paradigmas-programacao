import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercicios3Test {







    @Test
    public void SomaVetorParesERetorna2() {
        int vetor[] = {7,3,5,2};
        assertEquals(2, Exercicios3.getSomaVetorPares(vetor, 0));
    }

    @Test
    public void SomaVetorParesERetorna0() {
        int vetor[] = {7,3,5,3};
        assertEquals(0, Exercicios3.getSomaVetorPares(vetor, 0));
    }

    @Test
    public void SomaVetorParesERetorna50() {
        int vetor[] = {8,3,5,42};
        assertEquals(50, Exercicios3.getSomaVetorPares(vetor, 0));
    }



}
