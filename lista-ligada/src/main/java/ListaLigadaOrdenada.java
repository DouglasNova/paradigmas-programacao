public class ListaLigadaOrdenada extends ListaLigada {

    @Override
    public void insereNode(Integer valor) {
        Node ant = head.getNext();
        Node atual = head;

        while (atual != null) {
            if (atual.getInfo() <= valor) {
                atual.setNext(new Node(valor));

                ant.setNext(head.getNext());
                head.setNext(atual.getNext());
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
            if (atual.getInfo() < valor) {
                return  null;
            }if(atual.getInfo()==valor){
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
