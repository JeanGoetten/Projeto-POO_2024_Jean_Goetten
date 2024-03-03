import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;
public class Main {
    static List<String> poolPlayersName = new ArrayList<>();
    static int maxPlayers = 5;
    static int totalEnemiesPlayer = 0;
    static int totalCoinsPlayer = 0;
    static int[] totalEnemiesPerPlayer = {0, 0, 0, 0, 0};
    static int[] totalCoinsPerPlayer = {0, 0, 0, 0, 0};
    static Integer[] finalScorePerPlayer = {0, 0, 0, 0, 0};
    static int[][] coinsPlayerPerLevel = new int[5][3];
    static int[] maxCoinsPerLevel = {5, 15, 30};
    static int[] maxEnemiesPerLevel = {5, 15, 30};
    static int maxLevel = 3;
    static int level = 0;
    public static boolean AddNewPlayer(String name){
        boolean alreadyExist = false;
        if(poolPlayersName.size() < maxPlayers){ // verifica se há vaga disponível para o jogo
            for(int i = 0; i < poolPlayersName.size(); i++){ //verifica se nome de personagem já existe na lista
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
    public static void NewGame(){
        level = 0;
        totalEnemiesPlayer = 0;
        totalCoinsPlayer = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Crie um nome de personagem: ");
        String playerName = scan.nextLine();
        if(AddNewPlayer(playerName)){
            while (level < maxLevel){ // loop de jogo
                System.out.println(playerName + ", prima Enter para ir para a aventura " + (level + 1));
                scan.nextLine();
                Play(playerName);
            }
            if((level + 1) > maxLevel){
                System.out.println("Parabéns! Você completou a aventura!");
                totalCoinsPerPlayer[poolPlayersName.size() - 1] = totalCoinsPlayer; //registra na lista o total de moedas coletadas após a aventura
                totalEnemiesPerPlayer[poolPlayersName.size() - 1] = totalEnemiesPlayer; //registra na lista o total de inimigos abatidos após a aventura
            }
        }
    }
    public static void Play(String playerName){
        Random rand = new Random();
        int rNumberCoins = rand.nextInt(maxCoinsPerLevel[level] + 1); //sorteia aleatoriamente as moedas na fase
        int rNumberEnemies = rand.nextInt(maxEnemiesPerLevel[level] + 1); //sorteia aleatoriamente os inimigos na fase
        if(rNumberCoins == 0){ // se o valor de moedas coletadas for igual a 0, a aventura falhou e o jogador a repetirá
            System.out.println("Você obteve " + rNumberCoins + " moedas e sua aventura falhou! Por favor tente novamente!");
        }else if(rNumberCoins == maxCoinsPerLevel[level]){ // se coletou todas, o jogador passa direto de nível
            System.out.println("Você obteve " + rNumberCoins + " moedas e matou " +  rNumberEnemies + " inimigos. Aventura perfeita! Preparando próximo nível!");
            level++;
            totalEnemiesPlayer += rNumberEnemies; //incrementar inimigos abatidos
            totalCoinsPlayer += rNumberCoins; //incrementar moedas coletadas
            coinsPlayerPerLevel[FindPlayerIndex(playerName)][level - 1] = rNumberCoins; //registra as moedas coletadas na coluna player e linha level
        }else{
            Scanner scan = new Scanner(System.in);
            System.out.println("Você obteve " + rNumberCoins + " moedas de " + maxCoinsPerLevel[level] + " e matou " + rNumberEnemies + " inimigos nessa aventura. Manter pontuação e continuar (1); Refazer aventura (2)");
            int opt = scan.nextInt();
            switch (opt){
                case 1:
                    level++;
                    totalEnemiesPlayer += rNumberEnemies; //incrementar inimigos abatidos
                    totalCoinsPlayer += rNumberCoins; //incrementar moedas coletadas
                    coinsPlayerPerLevel[FindPlayerIndex(playerName)][level - 1] = rNumberCoins; //registra as moedas na coluna player e linha level
                    break;
                case 2: // repetir play
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
    public static void Leadership(){
        Map<String, Integer> leaderMap = new HashMap<>(); //cria um dicionário chave=playerName valor=pontos
        for(int i = 0; i < poolPlayersName.size(); i++){ //registra no dicionário o nome do player a soma de abates e moedas
            finalScorePerPlayer[i] = totalEnemiesPerPlayer[i] + totalCoinsPerPlayer[i];
            leaderMap.put(poolPlayersName.get(i), finalScorePerPlayer[i]);
        }
        leaderMap.entrySet().stream() //hieroglifos mágicos estilo javascrit que ordenam dicionários. fonte: stackoverflow
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
    public static void Scores(){ //Mostra a tabela de scores 1) Nome 2) Pontuação total 3) Moedas por nível
        for(int i = 0; i < poolPlayersName.size(); i++){
            System.out.println(poolPlayersName.get(i) + " - " + totalEnemiesPerPlayer[i] + " inimigos mortos");
            for(int j = 0; j < maxLevel; j++){
                System.out.println(" - Level " + (j + 1) + ": " + coinsPlayerPerLevel[i][j] + " moedas");
            }
            System.out.println(" ");
        }
    }
    public static void Menu(){
        Scanner scan = new Scanner(System.in);
        boolean playing = true;
        while(playing){
            System.out.println("1 - New Game; 2 - Leadership; 3 - Scoreboard; 4 - Sair");
            String opt = scan.next();
            switch (opt){
                case "1":
                    NewGame();
                    break;
                case "2":
                    Leadership();
                    break;
                case "3":
                    Scores();
                    break;
                default:
                    playing = false;
            }
        }
    }
    public static int FindPlayerIndex(String playerName){ //retorno o index referente ao nome na lista
        int playerIndex = 0;
        for(int i = 0; i < poolPlayersName.size(); i++){
            if(playerName.equals(poolPlayersName.get(i))){
                playerIndex = i;
            }
        }
        return playerIndex;
    }
    public static void main(String[] args) {
        System.out.println("SUPER MARIOISH LINHA DE COMANDO ADVENTURE");
        Menu();
    }
}