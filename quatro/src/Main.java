/*Criar um programa que pede ao usuário para digitar sua idade e imprime se ele é
menor ou maior de idade*/

import java.util.Scanner;

public class Main {
    public static String IdadeLegal(int a){
        String valor = "";
        if(a >= 18){
            valor = "Maior de idade";
        }else{
            valor = "Menor de idade";
        }
        return valor;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int userNum1 = scan.nextInt();

        String resposta = IdadeLegal(userNum1);
        System.out.println(resposta);
    }
}