//Você é responsável pelo desenvolvimento de um sistema de vendas de roupas para uma
//loja de moda feminina. A loja possui vários tipos de roupas, como camisas, calças e
//vestidos, cada um com suas próprias características, como tamanho, cor, tipo de manga,
//tipo de calça e tipo de decote.
//Para implementar esse sistema, você deve criar uma interface Produto com os seguintes
//        métodos:
//        • getNome() - retorna o nome do produto
//• getMarca() - retorna a marca do produto
//• getPreco() - retorna o preço do produto
//• setPreco(float preco) - atualiza o preço do produto
//        Em seguida, crie uma classe abstrata Roupa que implementa a interface Produto e
//        adiciona os seguintes atributos:
//        • tamanho - tamanho da roupa
//• cor - cor da roupa
//A classe abstrata Roupa também deve ter um método abstrato calcularPrecoFinal(floatacrescimo)
// que será implementado pelas classes concretas. Esse método recebe um
//valor de acréscimo e retorna o preço final do produto, considerando o desconto aplicável
//para cada tipo de roupa.
//Crie as classes concretas Camisa, Calca e Vestido, que estendem a classe Roupa e
//implementam o método calcularPrecoFinal(float acrescimo) de acordo com o desconto
//específico de cada tipo de roupa.
//        • A camisa tem um desconto de 10%
//        • A calça tem um desconto de 15%
//        • O vestido tem um desconto de 20%
//        Por fim, crie um método main para testar a implementação. Crie um objeto de cada uma
//das classes concretas, defina um valor de preço para cada um e chame o método
//alcularPrecoFinal(float acrescimo) para cada um dos objetos, passando um valor de
//acréscimo de 5. Exiba o resultado na tela.


import Roupas.Calca;
import Roupas.Camisa;
import Roupas.Vestido;

public class Main {
    public static void main(String[] args) {

        Camisa camisaRegata = new Camisa(30, "preta");
        Calca calcaJeans = new Calca(42, "azul");
        Vestido vestidoFlorido = new Vestido(20, "amarelo");

        camisaRegata.setPreco(150);
        calcaJeans.setPreco(300);
        vestidoFlorido.setPreco(600);

        System.out.println("Preço original regata: " + camisaRegata.getPreco() + " - Com desconto de " + camisaRegata.getDesconto() + "% e 5% de acréscimo. Preço final: " + camisaRegata.calcularPrecoFinal(5));
        System.out.println("Preço original calça: " + calcaJeans.getPreco() + " - Com desconto de " + calcaJeans.getDesconto() + "% e 5% de acréscimo. Preço final: " + calcaJeans.calcularPrecoFinal(5));
        System.out.println("Preço original vestido: " + vestidoFlorido.getPreco() + " - Com desconto de " + vestidoFlorido.getDesconto() + "% e 5% de acréscimo. Preço final: " + vestidoFlorido.calcularPrecoFinal(5));

    }
}