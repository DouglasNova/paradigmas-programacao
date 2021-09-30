public class ListaLigadaOrdenada extends ListaLigada {

    @Override
    public void insereNode(Integer valor) {
        Node ant = head;
        Node atual = head.getNext();
        var node = new Node(valor);

        var loop = true;
        while (loop) {
            if (atual != null) {
                if (atual.getInfo() <= valor) {
                    ant.setNext(node);
                    node.setNext(atual);
                    loop = false;
                } else {
                    ant = atual;
                    atual = atual.getNext();
                }
            } else {
                ant.setNext(node);
                node.setNext(atual);
                loop = false;
            }
        }

    }

    @Override
    public Node buscaNode(Integer valor) {
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == valor) {
                return atual;
            } else {
                atual = atual.getNext();
            }
        }
        return null;
    }

    @Override
    public boolean removeNode(Integer valor) {
        return super.removeNode(valor);
    }
}
