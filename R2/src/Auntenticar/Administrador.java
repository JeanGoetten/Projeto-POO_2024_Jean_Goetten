package Auntenticar;

public class Administrador implements Autenticavel{
    @Override
    public void sessao(boolean value) {
        if(value){
            System.out.println("Administrador online");
        }else{
            System.out.println("Administrador offline");
        }

    }
}
