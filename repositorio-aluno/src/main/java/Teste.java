public class Teste {

    public static void main(String[] args) {
        RepositorioImpl listaDuplamenteLigada = new RepositorioImpl();

        listaDuplamenteLigada.saveAll(CargaRepostitorio.load());

    }

}
