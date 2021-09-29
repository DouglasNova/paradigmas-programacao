public class ListaLigadaOrdenada extends ListaLigada {

    @Override
    public void insereNode(Integer valor) {
        Node ant = head;
        Node atual = head.getNext();

        while (atual != null) {
            if (atual.getInfo() <= valor) {
                var node = new Node(valor);
                ant.setNext(node);
                node.setNext(atual);
            } else {
                ant = atual;
                atual = atual.getNext();
            }

        }
    }

    @Override
    public Node buscaNode(Integer valor) {
        Node atual = head.getNext();
        while (atual != null) {
            if(atual.getInfo()==valor){
                return  atual;
            } else {
                atual =  atual.getNext();
            }
        }
        return null;
    }

    @Override
    public boolean removeNode(Integer valor) {
        return super.removeNode(valor);
    }
}
