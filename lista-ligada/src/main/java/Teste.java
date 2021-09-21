public class Teste {

    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada();

        listaLigada.insereNode(1);
        listaLigada.insereNode(5);
        listaLigada.insereNode(10);
        listaLigada.insereNode(15);
        listaLigada.insereNode(20);

        listaLigada.exibe();

        System.out.println(listaLigada.getHead());
        System.out.println(listaLigada.buscaNode(1));
        System.out.println(listaLigada.getTamanho()+"");
        System.out.println(listaLigada.removeNode(20)+"");


    }

}
