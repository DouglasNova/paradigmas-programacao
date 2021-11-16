public class NodeStream {

    private Node node;

    public NodeStream(Node node) {
        Node inicio = new Node(null);
        node = inicio;
        Node aux = node.getNext();
        while (aux != null){
            node.setNext(new Node(aux.getAluno()));
            node.getNext().setAnt(node);
            node = node.getNext();
            aux = aux.getNext();
        }
        node = inicio;
    }


    @FunctionalInterface
    public interface MapFunction{
        Aluno executar(Aluno aluno);
    }

    public NodeStream map(MapFunction funcao){
        Node aux = node.getNext();
        while (aux!=null){
            aux.setAluno(funcao.executar(aux.getAluno()));
            aux = aux.getNext();
        }
        return this;
    }

    @FunctionalInterface
    public interface ForEachFunction{
        void executar(Aluno aluno);
    }

    public NodeStream forEach(ForEachFunction funcao){
        Node aux = node.getNext();
        while (aux!=null){
            funcao.executar(aux.getAluno());
            aux = aux.getNext();
        }
        return this;
    }

    @FunctionalInterface
    public interface FilterFunction{
        boolean executar(Aluno aluno);
    }

    public NodeStream filter(FilterFunction funcao){
        Node aux = node.getNext();
        Node prev = aux.getAnt();
        while (aux!=null){
            if(!funcao.executar(aux.getAluno())) {
                prev.getNext().setAnt(aux.getNext());
                aux.getNext().setAnt(prev);
            }
            prev = prev.getNext();
            aux = aux.getNext();
        }
        node = prev;
        return this;
    }

    public Node toNode(){
        return node;
    }

}
