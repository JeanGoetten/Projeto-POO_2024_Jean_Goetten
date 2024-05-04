import java.util.ArrayList;

// Controller
class Controller {
    private ArrayList<Livro> livros;

    public Controller() {
        livros = LivroDAO.carregar();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        LivroDAO.salvar(livros);
    }

    public void removerLivro(int id) {
        livros.removeIf(livro -> livro.getId() == id);
        LivroDAO.salvar(livros);
    }

    public ArrayList<Livro> buscarPorAutor(String autor) {
        ArrayList<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    public ArrayList<Livro> buscarPorISBN(String ISBN) {
        ArrayList<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getISBN().equals(ISBN)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    public ArrayList<Livro> buscarPorTitulo(String titulo) {
        ArrayList<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                resultado.add(livro);
            }
        }
        return resultado;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
}