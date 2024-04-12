package PagamentoOnline;

public class UsuarioOnlinePaypal extends UsuarioOnline implements Paypal{


    public UsuarioOnlinePaypal(String nome) {
        super(nome);
    }

    @Override
    public void pagar() {
        System.out.println("O usuário " + getNome() + " Paypal pagou!");
    }

    @Override
    public void logar() {
        System.out.println("O usuário " + getNome() + " Paypal logou!");
    }
}
