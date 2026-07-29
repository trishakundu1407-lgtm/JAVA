import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float num1 = in.nextFloat();

        System.out.println("Enter your second number: ");
        float num2 = in.nextFloat();

        if (num1 > num2){
            System.out.println(num1 + " Is greater");
        }

        else{
            System.out.println(num2 + " Is greater");
        }
    }
    
}
