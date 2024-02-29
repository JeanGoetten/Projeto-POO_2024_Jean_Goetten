//Criar um programa que converte uma temperatura em Celsius para Fahrenheit.

import java.util.Scanner;

public class Main {
    public static float TempConverter(float a){
        float farenh = (a * 1.8f) + 32;
        return farenh;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Temperatura em Celsius: ");
        float celsius = scan.nextFloat();
        float farenh  = TempConverter(celsius);

        System.out.println(farenh + " F");
    }
}