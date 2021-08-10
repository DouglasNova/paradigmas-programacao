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

    public static int getContaVetor(int[] n, int inicio, int valorEscolhido){
        int soma = 0;
        if (inicio >= n.length)
            return 0;
        if (n[inicio] == valorEscolhido){
            soma ++;
        }
        soma += getContaVetor(n, inicio + 1, valorEscolhido);
        System.out.println("O valor "+valorEscolhido+" ocorre "+soma);
        return soma;

    }

    public static int getAlgoritimoEuclides(int n, int n2){
        if (n2 == 0){
            return n;
        }else if(n2 == 1){
            throw new IllegalArgumentException("Numero invalidos");
        }

        return getAlgoritimoEuclides(n2, n % n2);
    }

    public static int getMaiorVetorPares(int[] n, int inicio, int n2 ){
        if (inicio >= n.length)
            return n2;
        if (n[inicio] > n2){
            n2 = n[inicio];
        }
        return getMaiorVetorPares(n, inicio + 1, n2);
    }

    public static int getSomaCaracteres(int n ){

        if (n == 0){
            return 0;
        }

        return n % 10 + getSomaCaracteres(n / 10);
    }

    public static int getBinario(int n ){

        if (n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return Integer.parseInt(String.valueOf(getBinario(n / 2) + String.valueOf(n % 2)));
    }

}
