import java.util.Scanner;

public class Odd_Even {

    static boolean even(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if (even(n))
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}