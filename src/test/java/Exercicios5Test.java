import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercicios5Test {




    @Test
    public void QtdVetorescolhidoERetorna2() {
        int vetor[] = {7,3,5,3};
        assertEquals(2, Exercicios5.getContaVetor(vetor, 0, 3));
    }

    @Test
    public void QtdVetorescolhidoERetorna0() {
        int vetor[] = {7,3,5,3};
        assertEquals(0, Exercicios5.getContaVetor(vetor, 0, 6));
    }

    @Test
    public void QtdVetorescolhidoERetorna4() {
        int vetor[] = {2,2,2,2};
        assertEquals(4, Exercicios5.getContaVetor(vetor, 0, 2));
    }


}
