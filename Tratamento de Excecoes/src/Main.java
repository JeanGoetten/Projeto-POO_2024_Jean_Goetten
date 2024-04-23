import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int a = scan.nextInt();

        System.out.println("Insira outro número: ");
        int b = scan.nextInt();

        try{
            float c = (a/b);
        }catch(Exception e) {
            System.out.println("Error: " + e);
        }


        try{
            System.out.println("Escreva um número inteiro: ");
            String str = sc.nextLine();

            int number = Integer.parseInt(str);
            System.out.println(number);
        }catch (NumberFormatException e){
            System.out.println("Error: " + e);
        }

        int[] num = {1, 2, 3, 4};

        try{
            System.out.println(num[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e);
        }
    }
}