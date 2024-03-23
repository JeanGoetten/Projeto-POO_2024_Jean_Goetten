//5. Classe Livro: Crie uma classe Livro com atributos como título, autor e número de
//páginas. Crie um método para exibir as informações do livro.

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private String numeroPaginas;
    private ArrayList<String> info = new ArrayList<>();

    public Livro(String titulo, String autor, String numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

        this.info.add(this.titulo);
        this.info.add(this.autor);
        this.info.add(this.numeroPaginas);
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public String getNumeroPaginas() {
        return this.numeroPaginas;
    }
    public void info(){ // ver com o professor/monitor a possibilidade de múltiplos retornos em java
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.numeroPaginas);
    }
    public ArrayList<String> infoList(){ // retorna a lista de informações
        return this.info;
    }
}
