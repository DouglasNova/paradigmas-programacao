import java.util.ArrayList;
import java.util.List;

public class RepositorioImpl implements Repositorio{
    protected Node head;

    public RepositorioImpl() {
        head = new Node(new Aluno(null,null,null));
    }

    public Node getHead() {
        return head;
    }

    @Override
    public Aluno findByRA(String registro) {
        if(!existsByRA(registro)){
            return null;
        }

        Node nodeAluno = new NodeStream(head)
                .filter(aluno -> aluno.getRa().equals(registro))
                .toNode();

        return nodeAluno.getAluno();
    }

    @Override
    public List<Node> findBtTurma(String turma) {
        List<Node> lista = new ArrayList<>();

        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getAluno().getTurma() == turma) {
                lista.add(atual);
            } else {
                atual = atual.getNext();
            }
        }
        return lista;
    }

    @Override
    public void saveAll(List<Node> nodes) {
        for (Node a: nodes) {
            save(a);
        }
    }

    @Override
    public void save(Node node) {
        Node novo = node;
        if (head.getNext() == null){
            novo.setNext(head.getNext());
            head.setNext(novo);
        }else{
            novo.setNext(head.getNext());
            head.getNext().setAnt(novo);
            head.setNext(novo);
        }
    }

    @Override
    public void deleteAll() {
        head.setNext(null);
    }

    @Override
    public void delete(Node node) {
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getAluno().getRa() == node.getAluno().getRa()) {
                atual.getAnt().setNext(atual.getNext());
                atual.getNext().setAnt(atual.getAnt());
            } else {
                atual = atual.getNext();
            }
        }
    }

    @Override
    public int count() {
        Node atual = head.getNext();
        Integer tam = 0;
        while (atual != null) {
            tam++;
            atual = atual.getNext();
        }
        return tam;
    }

    @Override
    public boolean exists(Node node) {
        Node atual = head.getNext();
        while (atual != null) {
            if (atual == node) {
                return true;
            } else {
                atual = atual.getNext();
            }
        }
        return false;
    }

    @Override
    public boolean existsByRA(String registro) {
        Node atual = head.getNext();
        while (atual != null) {
            if (atual.getAluno().getRa() == registro) {
                return true;
            } else {
                atual = atual.getNext();
            }
        }
        return false;
    }


    @Override
    public List<Aluno> findAll(){
        List<Aluno> list = new ArrayList<>();
        new NodeStream(head).forEach(item -> list.add(item));
        return list;
    }
}
