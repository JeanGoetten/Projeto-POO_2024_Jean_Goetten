package Pagamento;

public class PagamentoDinheiro implements Pagamento {

    @Override
    public void efetuarPagamento() {
        System.out.println("Pagamento em dinheiro realizado!");
    }

    @Override
    public void calcularTroco() {
        System.out.println("Troco em dinheiro realizado!");
    }
}
