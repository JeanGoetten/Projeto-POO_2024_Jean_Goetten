
//        10. Sistema de Pagamento Online: Crie um sistema de pagamento online
//onde os usuários podem efetuar pagamentos usando diferentes métodos
//        de pagamento, como cartão de crédito, PayPal, etc. Utilize classes
//abstratas e interfaces para modelar os diferentes tipos de pagamento e
//os usuários do sistema.

import Animais.*;
import Autenticação.*;
import Casa.*;
import Escola.*;
import Pagamento.*;
import Pedidos.*;
import Repositorio.*;
import Veiculos.*;
import PagamentoOnline.*;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        PagamentoCartao pgCartao = new PagamentoCartao();
        PagamentoDinheiro pgDinheiro = new PagamentoDinheiro();

        Aluno aluno = new Aluno();

        Usuario user = new Usuario();
        Administrador admin = new Administrador();

        Pedido meuPedido = new Pedido();

        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        RepositorioCliente repCliente = new RepositorioCliente();
        RepositorioProduto repProduto = new RepositorioProduto();

        Casa casa = new Casa();

        UsuarioOnlineCartao userCartao = new UsuarioOnlineCartao("José");
        UsuarioOnlinePaypal userPaypal = new UsuarioOnlinePaypal("Maria");
        UsuarioOnlinePaypalCartao userPaypalCartao = new UsuarioOnlinePaypalCartao("Pedro");

        carro.acelerar();
        carro.frear();
        moto.acelerar();
        moto.frear();

        System.out.println();

        pgCartao.efetuarPagamento();
        pgCartao.calcularTroco();
        pgDinheiro.efetuarPagamento();
        pgDinheiro.calcularTroco();

        System.out.println();

        aluno.addDisciplina(new Disciplina("Matemática"));
        aluno.addDisciplina(new Disciplina("História"));
        aluno.addDisciplina(new Disciplina("Arte"));
        aluno.addDisciplina(new Disciplina("Gramática"));

        aluno.showDisciplinas();

        System.out.println();

        user.autenticar();
        admin.autenticar();

        System.out.println();

        meuPedido.addItem(new ItemPedido("Coca-cola"));
        meuPedido.addItem(new ItemPedido("Pizza"));
        meuPedido.addItem(new ItemPedido("Fritas"));

        meuPedido.listaPedido();

        System.out.println();

        gato.emitirSom();
        gato.mover();
        cachorro.emitirSom();
        cachorro.mover();

        System.out.println();

        repCliente.salvar();
        repCliente.buscarPorId();
        repCliente.excluir();
        repProduto.salvar();
        repProduto.buscarPorId();
        repProduto.excluir();

        System.out.println();

        casa.addQuarto(new Quarto("Quarto 1"));
        casa.addQuarto(new Quarto("Quarto 2"));
        casa.addQuarto(new Quarto("Quarto 3"));

        casa.qtdQuartos();

        System.out.println();

        userCartao.inserirSenha();
        userCartao.pagar();
        userPaypal.logar();
        userPaypal.pagar();
        userPaypalCartao.inserirSenha();
        userPaypalCartao.logar();
        userPaypalCartao.pagar();



    }
}