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

    @Test
    public void QtdVetorescolhidoERetorna2() {
        int vetor[] = {7,3,5,3};
        assertEquals(2, Exercicios.getContaVetor(vetor, 0, 3));
    }

    @Test
    public void QtdVetorescolhidoERetorna0() {
        int vetor[] = {7,3,5,3};
        assertEquals(0, Exercicios.getContaVetor(vetor, 0, 6));
    }

    @Test
    public void QtdVetorescolhidoERetorna4() {
        int vetor[] = {2,2,2,2};
        assertEquals(4, Exercicios.getContaVetor(vetor, 0, 2));
    }

    @Test
    public void QtdVetoresImparesERetorna3() {
        int vetor[] = {7,3,5,2};
        assertEquals(3, Exercicios.getContaVetorImpares(vetor, 0));
    }

    @Test
    public void QtdVetoresImparesERetorna0() {
        int vetor[] = {8,4,6,2};
        assertEquals(0, Exercicios.getContaVetorImpares(vetor, 0));
    }

    @Test
    public void EuclideERetorna18() {
        assertEquals(18, Exercicios.getAlgoritimoEuclides(90, 54));
    }

    @Test
    public void EuclideERetorna12() {
        assertEquals(12, Exercicios.getAlgoritimoEuclides(348, 156));
    }

    @Test
    public void EuclideERetornaExcessao() {
        try {
            Exercicios.getAlgoritimoEuclides(91, 54);
            assertTrue(false);
        }
        catch (IllegalArgumentException ex) {
            assertEquals("Numero invalidos", ex.getMessage());
        }
    }

    @Test
    public void MaiorVetorERetorna7() {
        int vetor[] = {7,3,5,2};
        assertEquals(7, Exercicios.getMaiorVetorPares(vetor,0, 0));
    }

    @Test
    public void MaiorVetorERetorna9() {
        int vetor[] = {7,3,8,9};
        assertEquals(9, Exercicios.getMaiorVetorPares(vetor, 0 ,0));
    }

    @Test
    public void somaCaracteresERetorna6() {
        assertEquals(6, Exercicios.getSomaCaracteres(132));
    }

    @Test
    public void somaCaracteresERetorna45() {
        assertEquals(45, Exercicios.getSomaCaracteres(99999));
    }

    @Test
    public void somaCaracteresERetorna45Negativo() {
        assertEquals(-45, Exercicios.getSomaCaracteres(-99999));
    }

    @Test
    public void somaCaracteresERetorna1110() {
        assertEquals(1110, Exercicios.getBinario(14));
    }

    @Test
    public void somaCaracteresERetorna1100() {
        assertEquals(1100, Exercicios.getBinario(12));
    }

    @Test
    public void somaCaracteresERetorna1110111100() {
        assertEquals(1110111100, Exercicios.getBinario(956));
    }


}
