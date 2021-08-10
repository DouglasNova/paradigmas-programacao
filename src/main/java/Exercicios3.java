public class Exercicios3 {

    public static void main(String[] args) {

    }


    public static int getSomaVetorPares(int[] n, int inicio){
        int soma = 0;
        if (inicio >= n.length)
            return 0;
        if (n[inicio] % 2 == 0){
            soma += n[inicio];
        }
        return soma + getSomaVetorPares(n, inicio + 1);
    }



}
