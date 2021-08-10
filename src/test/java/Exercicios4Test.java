import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercicios4Test {











    @Test
    public void QtdVetoresImparesERetorna3() {
        int vetor[] = {7,3,5,2};
        assertEquals(3, Exercicios4.getContaVetorImpares(vetor, 0));
    }

    @Test
    public void QtdVetoresImparesERetorna0() {
        int vetor[] = {8,4,6,2};
        assertEquals(0, Exercicios4.getContaVetorImpares(vetor, 0));
    }



}
