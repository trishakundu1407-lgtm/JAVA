import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        float num1 = in.nextFloat();

        System.out.println("Enter your second number: ");
        float num2 = in.nextFloat();

        System.out.println("Enter your operator: ");
        char operator = in.next().charAt(0);

        if (operator == '+'){
            System.out.println("the sum is: " + (num1 + num2));
        }

        else if (operator == '-'){
            System.out.println("the sum is: " + (num1 - num2));
        }

        else if (operator == '*'){
            System.out.println("the sum is: " + (num1 * num2));
        }

        else if (operator == '/'){
            System.out.println("the sum is: " + (num1 / num2));
        }

        else{
            System.out.println("Invalid operator");
        }



    }
}
