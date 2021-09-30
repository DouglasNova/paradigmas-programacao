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

        System.out.println("------------------");

        ListaLigadaOrdenada listaLigadaOrdenada = new ListaLigadaOrdenada();

        listaLigadaOrdenada.insereNode(11);
        listaLigadaOrdenada.insereNode(5);
        listaLigadaOrdenada.insereNode(10);
        listaLigadaOrdenada.insereNode(1);
        listaLigadaOrdenada.insereNode(20);

        listaLigadaOrdenada.exibe();

        System.out.println(listaLigadaOrdenada.getHead());
        System.out.println(listaLigadaOrdenada.buscaNode(1));
        System.out.println(listaLigadaOrdenada.getTamanho()+"");
        System.out.println(listaLigadaOrdenada.removeNode(20)+"");
        System.out.println(listaLigadaOrdenada.getTamanho()+"");


    }

}
