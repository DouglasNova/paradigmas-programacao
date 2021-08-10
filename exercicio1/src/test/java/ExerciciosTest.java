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


    @Test
    public void SomaVetorERetorna17() {
        int vetor[] = {7,3,5,2};
        assertEquals(17, Exercicios.getSomaVetor(vetor, 0));
    }

    @Test
    public void SomaVetorERetorna67() {
        int vetor[] = {12,15,22,18};
        assertEquals(67, Exercicios.getSomaVetor(vetor, 0));
    }

    @Test
    public void SomaVetorERetorna0() {
        int vetor[] = {0};
        assertEquals(0, Exercicios.getSomaVetor(vetor, 0));
    }

    @Test
    public void SomaVetorParesERetorna2() {
        int vetor[] = {7,3,5,2};
        assertEquals(2, Exercicios.getSomaVetorPares(vetor, 0));
    }

    @Test
    public void SomaVetorParesERetorna0() {
        int vetor[] = {7,3,5,3};
        assertEquals(0, Exercicios.getSomaVetorPares(vetor, 0));
    }

    @Test
    public void SomaVetorParesERetorna50() {
        int vetor[] = {8,3,5,42};
        assertEquals(50, Exercicios.getSomaVetorPares(vetor, 0));
    }


}
