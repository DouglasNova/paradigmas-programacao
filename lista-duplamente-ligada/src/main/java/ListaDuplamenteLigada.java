public class ListaDuplamenteLigada {
    protected DuplamenteNode head;

    public ListaDuplamenteLigada() {
        head = new DuplamenteNode(null);
    }

    public DuplamenteNode getHead() {
        return head;
    }

    public void insereNode(Integer valor) {
        DuplamenteNode novo = new DuplamenteNode(valor);
        if (head.getNext() == null){
            novo.setNext(head.getNext());
            head.setNext(novo);
        }else{
            novo.setNext(head.getNext());
            head.getNext().setAnt(novo);
            head.setNext(novo);
        }
    }

    public void exibe() {
        DuplamenteNode atual = head.getNext();
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getNext();
        }
    }

    public DuplamenteNode buscaNode(Integer valor) {
        DuplamenteNode atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == valor) {
                return atual;
            } else {
                atual = atual.getNext();
            }
        }
        return null;
    }

    public boolean removeNode(Integer valor) {
        DuplamenteNode atual = head.getNext();
        while (atual != null) {
            if (atual.getInfo() == valor) {
                atual.getAnt().setNext(atual.getNext());
                atual.getNext().setAnt(atual.getAnt());
                return true;
            } else {
                atual = atual.getNext();
            }
        }
        return false;
    }

    public Integer getTamanho() {
        DuplamenteNode atual = head.getNext();
        Integer tam = 0;
        while (atual != null) {
            tam++;
            atual = atual.getNext();
        }
        return tam;
    }
}
