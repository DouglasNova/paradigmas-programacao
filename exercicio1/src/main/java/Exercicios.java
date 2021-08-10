public class Exercicios {

    public static void main(String[] args) {

    }

    public static int getSoma(int n) {
        if (n == 0){
            return 0;
        }else if (n == 1) {
            return 1;
        } else if (n < 0) {
            throw new IllegalArgumentException("N não pode ser negativo");
        }

        int n2 = getSoma(n - 1);
        return n + n2;
    }

    public static int getSomaVetor(int[] n, int inicio){

        if (inicio >= n.length)
            return 0;
        else
            return n[inicio] + getSomaVetor(n, inicio + 1);

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

    public static int getContaVetorImpares(int[] n, int inicio){
        int soma = 0;
        if (inicio >= n.length)
            return 0;
        if (n[inicio] % 2 == 1){
            soma ++;
        }
        return soma + getContaVetorImpares(n, inicio + 1);

    }

    public static int getContaVetor(int[] n){
        return 0;
    }

    public static int getAlgoritimoEuclides(int[] n){
        return 0;
    }
}
