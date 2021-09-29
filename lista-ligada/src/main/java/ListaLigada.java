public class ListaLigada {
    protected Node head;

    public ListaLigada() {
        head = new Node(null);
    }

    public Node getHead() {
        return head;
    }

    public void insereNode(Integer valor) {
        Node novo = new Node(valor);
        novo.setNext(head.getNext());
        head.setNext(novo);
    }

    public void exibe() {
        Node atual = head.getNext();
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public Node buscaNode(Integer valor) {
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == valor) {
                return atual;
            } else {
                atual = atual.getNext();
            }
            atual = atual.getNext();
        }
        return null;
    }

    public boolean removeNode(Integer valor) {
        Node ant = head;
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == valor) {
                ant.setNext(atual.getNext());
                return true;
            } else {
                ant = atual;
                atual = atual.getNext();
            }
        }
        return false;
    }

    public Integer getTamanho() {
        Node atual = head.getNext();
        Integer tam = 0;
        while (atual != null) {
            tam++;
            atual = atual.getNext();
        }
        return tam;
    }
}
