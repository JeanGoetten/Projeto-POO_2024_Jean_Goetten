package Repositorio;

public class RepositorioProduto implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvou produto");
    }

    @Override
    public void buscarPorId() {
        System.out.println("Retornou id do produto");
    }

    @Override
    public void excluir() {
        System.out.println("Excluiu produto");
    }
}
