
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercicios2Test {



    @Test
    public void SomaVetorERetorna17() {
        int vetor[] = {7,3,5,2};
        assertEquals(17, Exercicios2.getSomaVetor(vetor, 0));
    }

    @Test
    public void SomaVetorERetorna67() {
        int vetor[] = {12,15,22,18};
        assertEquals(67, Exercicios2.getSomaVetor(vetor, 0));
    }

    @Test
    public void SomaVetorERetorna0() {
        int vetor[] = {0};
        assertEquals(0, Exercicios2.getSomaVetor(vetor, 0));
    }

}
