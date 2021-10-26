import java.util.ArrayList;
import java.util.List;

public class RepositorioImpl implements Repositorio{
    protected Aluno head;

    public RepositorioImpl() {
        head = new Aluno(null,null,null);
    }

    public Aluno getHead() {
        return head;
    }

    @Override
    public Aluno findByRA(String registro) {
        Aluno atual = head.getNext();
        while (atual != null) {
            if (atual.getRa() == registro) {
                return atual;
            } else {
                atual = atual.getNext();
            }
        }
        return null;
    }

    @Override
    public List<Aluno> findBtTurma(String turma) {
        List<Aluno> lista = new ArrayList<>();

        Aluno atual = head.getNext();
        while (atual != null) {
            if (atual.getTurma() == turma) {
                lista.add(atual);
            } else {
                atual = atual.getNext();
            }
        }
        return lista;
    }

    @Override
    public void saveAll(List<Aluno> alunos) {
        for (Aluno a: alunos) {
            save(a);
        }
    }

    @Override
    public void save(Aluno aluno) {
        Aluno novo = aluno;
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
    public void delete(Aluno aluno) {
        Aluno atual = head.getNext();
        while (atual != null) {
            if (atual.getRa() == aluno.getRa()) {
                atual.getAnt().setNext(atual.getNext());
                atual.getNext().setAnt(atual.getAnt());
            } else {
                atual = atual.getNext();
            }
        }
    }

    @Override
    public int count() {
        Aluno atual = head.getNext();
        Integer tam = 0;
        while (atual != null) {
            tam++;
            atual = atual.getNext();
        }
        return tam;
    }

    @Override
    public boolean exists(Aluno aluno) {
        Aluno atual = head.getNext();
        while (atual != null) {
            if (atual == aluno) {
                return true;
            } else {
                atual = atual.getNext();
            }
        }
        return false;
    }

    @Override
    public boolean existsByRA(String registro) {
        Aluno atual = head.getNext();
        while (atual != null) {
            if (atual.getRa() == registro) {
                return true;
            } else {
                atual = atual.getNext();
            }
        }
        return false;
    }


    @Override
    public List<Aluno> findAll(){
        List<Aluno> lista = new ArrayList<>();
        Aluno atual = head.getNext();
        while (atual != null) {
            lista.add(atual);
            atual = atual.getNext();
        }
        return lista;
    }
}
