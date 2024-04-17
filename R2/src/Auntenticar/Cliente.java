package Auntenticar;

public class Cliente implements Autenticavel{

    @Override
    public void sessao(boolean value) {
        if(value){
            System.out.println("Cliente online");
        }else{
            System.out.println("Cliente offline");
        }

    }
}
