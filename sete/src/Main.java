//Criar um programa que simula o jogo pedra, papel e tesoura.

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static String Play(int userPlay){
        String result = "";

        Random rndNumber = new Random();
        int cpuPlay = rndNumber.nextInt(3) + 1;

        if(cpuPlay == 1){
            System.out.println("Computador jogou Pedra");
            if(userPlay == 1){
                result = "EMPATE";
            }else if(userPlay == 2){
                result = "VC GANHOU";
            }else{
                result = "VC PERDEU";
            }
        }
        if(cpuPlay == 2){
            System.out.println("Computador jogou Papel");
            if(userPlay == 1){
                result = "VC PERDEU";
            }else if(userPlay == 2){
                result = "EMPATE";
            }else{
                result = "VC GANHOU";
            }
        }
        if(cpuPlay == 3){
            System.out.println("Computador jogou Tesoura");
            if(userPlay == 1){
                result = "VC GANHOU";
            }else if(userPlay == 2){
                result = "VC PERDEU";
            }else{
                result = "EMPATE";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pedra (1) - Papel (2) - Tesoura (3): ");

        int userPlay = scan.nextInt();

        String result = Play(userPlay);

        System.out.println(result);
    }
}