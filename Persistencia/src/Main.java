//1. Vamos criar um Catálogo de Livros utilizando o modelo MVC. Você deve criar 3
//classes. Uma classe chamada “Livro”, nela você encontrará os Atributos e
//Métodos específicos do Livro. Os atributos são: id, título, autor, ISBN, páginas,
//preço. Faça os respectivos Getters e Setters desses atributos.
//        2. Agora, crie uma Classe chamada LivroDAO, nela você deve colocar a
//persistência dos livros em um arquivo Serializado chamado BIBLIOTECA.DAT.
//3. Crie uma Classe chamada LivroController, essa deve conter métodos que
//possibilitem o Diálogo entre a Classe View, a Classe Livro e a Classe LivroDAO.
//4. Crie uma Classe chamada LivroView, essa será a sua classe Main, você deve
//construir um Menu que possibilite Inserir Livros, Excluir Livros, Buscar Livros por
//Autor, ISBN ou Título. Você também deve ter uma tela que apareça a Lista dos
//Livros catalogados.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

// View
class LivroView {
    private Controller controller;

    public LivroView() {
        controller = new Controller();
    }

    public void exibirMenu() {
        System.out.println("1. Inserir Livro");
        System.out.println("2. Excluir Livro");
        System.out.println("3. Buscar Livro por Autor");
        System.out.println("4. Buscar Livro por ISBN");
        System.out.println("5. Buscar Livro por Título");
        System.out.println("6. Listar todos os Livros");
        System.out.println("7. Sair");
    }

    public void inserirLivro() {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o ID do livro:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            System.out.println("Digite o título do livro:");
            String titulo = scanner.nextLine();
            System.out.println("Digite o autor do livro:");
            String autor = scanner.nextLine();
            System.out.println("Digite o ISBN do livro:");
            String isbn = scanner.nextLine();
            System.out.println("Digite o número de páginas do livro:");
            int paginas = scanner.nextInt();
            System.out.println("Digite o preço do livro:");
            double preco = scanner.nextDouble();

            Livro livro = new Livro(id, titulo, autor, isbn, paginas, preco);
            controller.adicionarLivro(livro);
            System.out.println("Livro adicionado com sucesso!");
        }catch (InputMismatchException e){
            System.out.println(e);
        }
    }

    public void excluirLivro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ID do livro que deseja excluir:");
        int id = scanner.nextInt();
        controller.removerLivro(id);
        System.out.println("Livro removido com sucesso!");
    }

    public void buscarPorAutor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do autor:");
        String autor = scanner.nextLine();
        ArrayList<Livro> resultados = controller.buscarPorAutor(autor);
        if (resultados.isEmpty()) {
            System.out.println("Nenhum livro encontrado para o autor informado.");
        } else {
            System.out.println("Livros encontrados para o autor " + autor + ":");
            for (Livro livro : resultados) {
                System.out.println(livro.getTitulo());
            }
        }
    }

    public void buscarPorISBN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ISBN do livro:");
        String isbn = scanner.nextLine();
        ArrayList<Livro> resultados = controller.buscarPorISBN(isbn);
        if (resultados.isEmpty()) {
            System.out.println("Nenhum livro encontrado para o ISBN informado.");
        } else {
            System.out.println("Livro encontrado para o ISBN " + isbn + ":");
            for (Livro livro : resultados) {
                System.out.println(livro.getTitulo());
            }
        }
    }

    public void buscarPorTitulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        ArrayList<Livro> resultados = controller.buscarPorTitulo(titulo);
        if (resultados.isEmpty()) {
            System.out.println("Nenhum livro encontrado para o título informado.");
        } else {
            System.out.println("Livro encontrado para o título " + titulo + ":");
            for (Livro livro : resultados) {
                System.out.println(livro.getTitulo() + " - " + livro.getAutor());
            }
        }

    }

    public void listarLivros() {
        ArrayList<Livro> livros = controller.getLivros();
        for (Livro livro : livros) {
            System.out.println("ID: " + livro.getId());
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("ISBN: " + livro.getISBN());
            System.out.println("Páginas: " + livro.getPaginas());
            System.out.println("Preço: " + livro.getPreco());
            System.out.println("------------------------");
        }
    }

    public void executar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner
            switch (opcao) {
                case 1:
                    inserirLivro();
                    break;
                case 2:
                    excluirLivro();
                    break;
                case 3:
                    buscarPorAutor();
                    break;
                case 4:
                    buscarPorISBN();
                    break;
                case 5:
                    buscarPorTitulo();
                    break;
                case 6:
                    listarLivros();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        LivroView view = new LivroView();
        view.executar();
    }
}