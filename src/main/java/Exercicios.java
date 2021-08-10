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
}
