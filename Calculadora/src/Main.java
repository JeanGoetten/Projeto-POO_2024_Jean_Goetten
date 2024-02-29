import java.util.Scanner;
public class Main {
    public static float Sum(float A, float B){
        return A + B;
    }
    public static float Subtract(float A, float B) { return A - B; }
    public static float Multiplication(float A, float B){
        return A * B;
    }
    public static float Division(float A, float B){
        return A / B;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("calculator - enter x to exit");
        System.out.println("Choose the desired operation (1 - addition; 2 - subtraction; 3 - multiplication; 4 - division):");
        String opt = scan.next();
        if(opt.chars().allMatch( Character::isDigit)){
            System.out.println("Enter the first number:");
            float numA = scan.nextFloat();
            System.out.println("Enter the first number:");
            float numB = scan.nextFloat();
            switch (opt){
                case "1":
                    System.out.println(Sum(numA, numB));
                    break;
                case "2":
                    System.out.println(Subtract(numA, numB));
                    break;
                case "3":
                    System.out.println(Multiplication(numA, numB));
                    break;
                case "4":
                    System.out.println(Division(numA, numB));
                    break;
                default:
                    System.exit(0);
            }
        }else{
            System.exit(0);
        }

    }
}