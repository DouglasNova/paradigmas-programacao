public class Exercicios2 {

    public static void main(String[] args) {

    }


    public static int getSomaVetor(int[] n, int inicio){

        if (inicio >= n.length)
            return 0;
        else
            return n[inicio] + getSomaVetor(n, inicio + 1);

    }



}
