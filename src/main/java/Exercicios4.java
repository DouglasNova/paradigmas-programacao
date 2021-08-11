public class Exercicios4 {

    public static void main(String[] args) {

    }


    public static int getContaVetorImpares(int[] n, int inicio){
        int soma = 0;
        if (inicio >= n.length)
            return 0;
        if (n[inicio] % 2 != 0){
            soma ++;
        }
        return soma + getContaVetorImpares(n, inicio + 1);

    }



}
