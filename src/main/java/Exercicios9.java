public class Exercicios9 {

    public static void main(String[] args) {

    }


    public static int getBinario(int n ){

        if (n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return Integer.parseInt(""+getBinario(n / 2) + n % 2);
    }

}
