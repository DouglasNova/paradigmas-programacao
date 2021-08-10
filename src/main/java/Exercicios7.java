public class Exercicios7 {

    public static void main(String[] args) {

    }

    public static int getMaiorVetorPares(int[] n, int inicio, int n2 ){
        if (inicio >= n.length)
            return n2;
        if (n[inicio] > n2){
            n2 = n[inicio];
        }
        return getMaiorVetorPares(n, inicio + 1, n2);
    }


}
