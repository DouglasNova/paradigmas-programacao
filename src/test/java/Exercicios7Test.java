import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercicios7Test {



    @Test
    public void MaiorVetorERetorna7() {
        int vetor[] = {7,3,5,2};
        assertEquals(7, Exercicios7.getMaiorVetorPares(vetor,0, 0));
    }

    @Test
    public void MaiorVetorERetorna9() {
        int vetor[] = {7,3,8,9};
        assertEquals(9, Exercicios7.getMaiorVetorPares(vetor, 0 ,0));
    }


}
