package Auntenticar;

public class Usuario implements Autenticavel{

    @Override
    public void sessao(boolean value) {
        if(value){
            System.out.println("Usuario online");
        }else{
            System.out.println("Usuario offline");
        }

    }
}
