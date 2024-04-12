package PagamentoOnline;

public class UsuarioOnlinePaypalCartao extends UsuarioOnline implements CartaoCredito, Paypal{


    public UsuarioOnlinePaypalCartao(String nome) {
        super(nome);
    }

    @Override
    public void inserirSenha() {
        System.out.println("O usuário " + getNome() + " Paypal e Cartão insiriu a senha!");
    }

    @Override
    public void pagar() {
        System.out.println("O usuário " + getNome() + " Paypal e Cartão pagou!");
    }

    @Override
    public void logar() {
        System.out.println("O usuário " + getNome() + " Paypal e Cartão logou!");
    }
}
