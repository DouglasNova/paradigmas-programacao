public class Exercicios5 {

    public static void main(String[] args) {

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



}
