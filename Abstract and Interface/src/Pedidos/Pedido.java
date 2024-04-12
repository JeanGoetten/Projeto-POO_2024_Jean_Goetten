package Pedidos;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public void addItem(ItemPedido item){
        itens.add(item);
    }

    public void listaPedido(){
        for(ItemPedido itemPedido : itens){
            System.out.println(itemPedido.getNome());
        }
    }
}
