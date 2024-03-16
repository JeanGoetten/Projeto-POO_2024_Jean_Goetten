/*Início
➢ O usuário seleciona uma das opções disponíveis no menu (cadastrar pessoa,
                                                          listar pessoas ou buscar pessoas por tipo)
➢ Se o usuário selecionar "cadastrar pessoa", ele será direcionado para o formulário
de cadastro
➢ O usuário preenche os campos do formulário de cadastro e clica em "Salvar"
        ➢ O sistema armazena os dados da pessoa cadastrada e retorna ao menu principal
➢ Se o usuário selecionar "listar pessoas", o sistema exibe a lista completa de
pessoas cadastradas
➢ Se o usuário selecionar "buscar pessoas por tipo", ele deve escolher um dos tipos
disponíveis (cliente, funcionário ou gerente)
➢ O sistema exibe uma lista com todas as pessoas cadastradas do tipo selecionado
pelo usuário
➢ Fim*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("============= Cadastro =============");
        Scanner scan = new Scanner(System.in);

        ArrayList<Pessoa> cadastros = new ArrayList<>();

        int opt = 0;
        while(opt != 4){
            System.out.println("\n1 - Cadastrar; 2 - Listar; 3 - Buscar; 4 - Sair: ");
            opt = scan.nextInt();
            switch (opt){
                case 1: // cadastrar
                    Pessoa nova_pessoa;

                    System.out.println("Nome: ");
                    String nome = scan.next();
                    System.out.println("Tipo (1 - Cliente; 2 - Funcionario; 3 - Cliente): ");
                    int tipo = scan.nextInt();

                    nova_pessoa = new Pessoa(nome, tipo);
                    cadastros.add(nova_pessoa);
                    System.out.println("Cadastro realizado com sucesso");

                    break;
                case 2: // listar
                    for(var pessoa: cadastros){
                        String tiop = switch (pessoa.getTipo()) { // sugestão de sintaxe 'switch' da IDE
                            case 1 -> "Cliente";
                            case 2 -> "Funcionario";
                            case 3 -> "Gerente";
                            default -> "";
                        };
                        System.out.println(pessoa.getNome() + " - " + tiop);
                    }
                    break;
                case 3: // buscar
                    System.out.println("Selecione o tipo (1 - Cliente; 2 - Funcionario; 3 - Gerente): ");
                    Integer opt2 = scan.nextInt();
                    int count = 0; // contador para lógica estranha
                    for(var pessoa: cadastros) {
                        if (pessoa.getTipo().equals(opt2)) {
                            System.out.printf(pessoa.getNome() + "\n");
                        }else{
                            count++; // incremento da lógica estranha
                        }
                    }
                    if(count == cadastros.size()){  // print da lógica estranha
                        System.out.println("Nenhum usuário encontrado");
                    }
                    break;
                case 4: // sair
                    System.out.println("Processo finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}