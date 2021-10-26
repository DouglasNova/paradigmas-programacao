
public class Aluno {

    private String ra;
    private String nome;
    private String turma;
    private Aluno next;
    private Aluno ant;

    public Aluno(String ra, String nome, String turma) {
        this.ra = ra;
        this.nome = nome;
        this.turma = turma;
        this.next = null;
        this.ant = null;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Aluno getNext() {
        return next;
    }

    public void setNext(Aluno next) {
        this.next = next;
    }

    public Aluno getAnt() {
        return ant;
    }

    public void setAnt(Aluno ant) {
        this.ant = ant;
    }
}
