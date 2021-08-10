public class Exercicios6 {

    public static void main(String[] args) {

    }



    public static int getAlgoritimoEuclides(int n, int n2){
        if (n2 == 0){
            return n;
        }else if(n2 == 1){
            throw new IllegalArgumentException("Numero invalidos");
        }

        return getAlgoritimoEuclides(n2, n % n2);
    }


}
