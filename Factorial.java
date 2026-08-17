import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        int fact = 1;

        for (int i = 1; i <=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int result = factorial(n);

        System.out.println("Factorial = " + result);
    }
}
