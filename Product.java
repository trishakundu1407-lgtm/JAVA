import java.util.Scanner;

public class Product {
    static int product(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int result = product(a, b);

        System.out.println("Product of the numbers = " + result);
    }
}
