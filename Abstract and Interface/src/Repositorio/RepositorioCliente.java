package Repositorio;

public class RepositorioCliente implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvou cliente");
    }

    @Override
    public void buscarPorId() {
        System.out.println("Buscou id do cliente");
    }

    @Override
    public void excluir() {
        System.out.println("Excluiu cliente");
    }
}
