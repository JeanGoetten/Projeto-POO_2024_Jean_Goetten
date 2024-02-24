import java.util.Scanner;

public class Main {
    public static String verificaNumero (int x){
        String valor = "";

        if (x > 0) {
            valor = "positivo";
        } else if (x < 0) {
            valor = "negativo";
        } else {
            valor = "zero";
        }
        return valor;
    }
    public static void main(String[] args) {



        System.out.println("Digite um número inteiro: ");
        Scanner scan = new Scanner(System.in);
        int userNum = scan.nextInt();

        System.out.println("O número é " + verificaNumero(userNum));


    }
}