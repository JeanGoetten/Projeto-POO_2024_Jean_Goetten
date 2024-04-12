package PagamentoOnline;

public class UsuarioOnlineCartao extends UsuarioOnline implements CartaoCredito{


    public UsuarioOnlineCartao(String nome) {
        super(nome);
    }

    @Override
    public void inserirSenha() {
        System.out.println("O usuário " + getNome() + " Cartão insiriu a senha!");
    }

    @Override
    public void pagar() {
        System.out.println("O usuário " + getNome() + " Cartão pagou!");
    }
}
