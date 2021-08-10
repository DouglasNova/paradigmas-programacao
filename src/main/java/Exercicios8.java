public class Exercicios8 {

    public static void main(String[] args) {

    }


    public static int getSomaCaracteres(int n ){

        if (n == 0){
            return 0;
        }

        return n % 10 + getSomaCaracteres(n / 10);
    }


}
