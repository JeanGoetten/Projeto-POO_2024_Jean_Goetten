/*Você está desenvolvendo um sistema para um jogo de plataforma estilo "Mario". O jogo tem
        vários níveis, e em cada nível, o jogador pode coletar moedas e derrotar inimigos para ganhar
pontos. Cada jogador tem um nome único e uma pontuação total acumulada. O objetivo é criar
um sistema para armazenar esses dados e realizar algumas operações básicas.
Implemente um programa em Java que utilize vetores para armazenar informações sobre os
jogadores, suas pontuações e a quantidade de moedas que coletaram em cada nível. O
programa deve permitir as seguintes operações:
a) Adicionar um novo jogador com seu nome, pontuação inicial e as quantidades
de moedas coletadas em cada nível.
b) Atualizar a pontuação de um jogador após a conclusão de um nível.
c) Mostrar a pontuação total de um jogador.
        d) Mostrar o total de moedas coletadas em um determinado nível por todos os
jogadores.
        e) Mostrar o jogador com a pontuação mais alta.
        ** Considere que o número de jogadores e o número de níveis são fixos.
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    //Variáveis
    static List<String> poolPlayersName = new ArrayList<>();
    static int maxPlayers = 5;
    static int totalScorePlayer = 0;
    static int[][] scorePlayerPerLevel = new int[5][3];
    static int[] maxScorePerLevel = {5, 15, 30};
    static int maxLevel = 3;
    static int level = 0;
    //Funções
    public static boolean AddNewPlayer(String name){
        //adiciona novo jogador se ainda não existente
        boolean alreadyExist = false;
        if(poolPlayersName.size() < maxPlayers){
            for(int i = 0; i < poolPlayersName.size(); i++){ //verificar se nome de personagem já existe
                if(poolPlayersName.get(i).equals(name)){
                    alreadyExist = true;
                }else{
                    alreadyExist = false;
                }
            }
            if(!alreadyExist){
                poolPlayersName.add(name);
                return true;
            }else{
                System.out.println("Nome já utilizado. Tente outro. ");
                return false;
            }
        }else{
            System.out.println("As inscrições para essa aventura se esgotaram. Lamentamos!");
            return false;
        }
    }
    public static void AddMoreScore(String playerName ){
        // adiciona a pontuação do nível
    }
    public static void NewGame(){
        level = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Crie um nome de personagem: ");
        String playerName = scan.nextLine();

        if(AddNewPlayer(playerName)){
            while (level < maxLevel){
                System.out.println(playerName + ", prima Enter para ir para a aventura " + (level + 1));
                scan.nextLine();

                Play(playerName);
            }
        }
    }
    public static void Play(String playerName){
        // sorteia aleatoriamente um valor de score
        Random rand = new Random();
        int rNumber = rand.nextInt(maxScorePerLevel[level] + 1);
        if(rNumber == 0){ // se o valor do score for igual a 0, a aventura falhou e o jogador a repetirá
            System.out.println("Você obteve " + rNumber + " pontos e sua aventura falhou! Por favor tente novamente!");
            // repetir play
        }else if(rNumber == maxScorePerLevel[level]){ // se o score for máximo, o jogador passa direto de nível
            System.out.println("Você obteve " + rNumber + " pontos e sua aventura foi perfeita! Preparando próximo nível!");
            level++;
            totalScorePlayer += rNumber; //incrementar score
            scorePlayerPerLevel[FindPlayerIndex(playerName)][level - 1] = rNumber; //registra os pontos na coluna player e linha level
        }else{
            Scanner scan = new Scanner(System.in);
            System.out.println("Você obteve " + rNumber + " pontos de " + maxScorePerLevel[level] + " nessa aventura. Manter pontuação e continuar (1); Refazer aventura (2)");
            int opt = scan.nextInt();
            switch (opt){
                case 1:
                    level++;
                    totalScorePlayer += rNumber; //incrementar score
                    scorePlayerPerLevel[FindPlayerIndex(playerName)][level - 1] = rNumber; //registra os pontos na coluna player e linha level
                    break;
                case 2:
                    // repetir play
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
    }
    public static void Continue(String playerName){
        //Pega o nome de jogador para verificar até que fase foi ou se quer repetir alguma fase
    }
    public static void Scores(){
        //Mostra a tabela de scores
    }
    public static void Menu(){
        Scanner scan = new Scanner(System.in);

        boolean playing = true;

        while(playing){
            System.out.println("1 - New Game; 2 - Continue; 3 - Scoreboard; 4 - Sair");
            String opt = scan.next();

            //Menu
            switch (opt){
                case "1":
                    NewGame();
                    break;
                case "2":
                    System.out.println("Insira seu nome de jogador: ");
                    String playerName = scan.nextLine();
                    Continue(playerName);
                    break;
                case "3":
                    Scores();
                    break;
                default:
                    playing = false;
                    //System.exit(0);
            }
        }
    }
    public static int FindPlayerIndex(String playerName){
        int playerIndex = 0;
        for(int i = 0; i < poolPlayersName.size(); i++){
            if(playerName.equals(poolPlayersName.get(i))){
                playerIndex = i;
            }
        }
        return playerIndex;
    }
    //Main
    public static void main(String[] args) {
        System.out.println("SUPER MARIOISH LINHA DE COMANDO ADVENTURE");
        Menu();
    }
}