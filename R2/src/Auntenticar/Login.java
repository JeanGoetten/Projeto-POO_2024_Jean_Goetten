package Auntenticar;

public final class Login {

    private Usuario usuario;
    private Administrador administrador;
    private Cliente cliente;

    public Login(Administrador admin) {
        System.out.println("Nova sessão criada...");
        usuario = new Usuario();
        cliente = new Cliente();

        administrador = admin;
        administrador.sessao(true);

        usuario.sessao(false);
        cliente.sessao(false);
    }

    public void newLogin(Usuario usuario){
        this.usuario = usuario;
        usuario.sessao(true);
    }
    public void newLogin(Cliente cliente){
        this.cliente = cliente;
        cliente.sessao(true);
    }
}
