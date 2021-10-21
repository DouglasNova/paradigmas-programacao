public class Teste {

    public static void main(String[] args) {
        ListaDuplamenteLigada listaDuplamenteLigada = new ListaDuplamenteLigada();

        listaDuplamenteLigada.insereNode(10);
        listaDuplamenteLigada.insereNode(12);
        listaDuplamenteLigada.insereNode(14);
        listaDuplamenteLigada.insereNode(11);
        listaDuplamenteLigada.insereNode(19);
        listaDuplamenteLigada.insereNode(30);

        listaDuplamenteLigada.exibe();

        System.out.println(listaDuplamenteLigada.buscaNode(10));
        System.out.println(listaDuplamenteLigada.buscaNode(12));
        System.out.println(listaDuplamenteLigada.buscaNode(14));
        System.out.println(listaDuplamenteLigada.buscaNode(11));
        System.out.println(listaDuplamenteLigada.buscaNode(19));
        System.out.println(listaDuplamenteLigada.buscaNode(30));
        listaDuplamenteLigada.exibe();
        System.out.println(listaDuplamenteLigada.removeNode(19));
        System.out.println(listaDuplamenteLigada.buscaNode(19));
        System.out.println(listaDuplamenteLigada.buscaNode(39));
        listaDuplamenteLigada.exibe();

    }

}
