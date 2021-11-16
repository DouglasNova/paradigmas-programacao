
public class Node {

    private Aluno aluno;
    private Node next;
    private Node ant;

    public Node(Aluno aluno) {
        this.aluno = aluno;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getAnt() {
        return ant;
    }

    public void setAnt(Node ant) {
        this.ant = ant;
    }
}
