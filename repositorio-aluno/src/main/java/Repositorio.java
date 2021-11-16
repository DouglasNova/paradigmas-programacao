import java.util.List;

public interface Repositorio {

    List<Aluno>findAll();
    Aluno findByRA(String registro);
    List<Node> findBtTurma(String turma);
    void saveAll(List<Node> nodes);
    void save(Node node);
    void deleteAll();
    void delete(Node node);
    int count();
    boolean exists(Node node);
    boolean existsByRA(String registro);


}
