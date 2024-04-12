package Pagamento;

public class PagamentoCartao implements Pagamento{
    @Override
    public void efetuarPagamento(){
        System.out.println("Pagamento em cartão realizado!");
    }
    public void calcularTroco(){
        System.out.println("Troco no cartão realizado!?");
    }
}
