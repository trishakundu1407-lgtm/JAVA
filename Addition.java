import java.util.Scanner;

public class Addition {

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        int result = sum(a, b);

        System.out.println("Sum = " + result);
    }
}