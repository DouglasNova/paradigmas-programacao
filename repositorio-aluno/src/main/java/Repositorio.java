import java.util.List;

public interface Repositorio {

    List<Aluno> findAll();
    Aluno findByRA(String registro);
    List<Aluno> findBtTurma(String turma);
    void saveAll(List<Aluno> alunos);
    void save(Aluno aluno);
    void deleteAll();
    void delete(Aluno aluno);
    int count();
    boolean exists(Aluno aluno);
    boolean existsByRA(String registro);


}
