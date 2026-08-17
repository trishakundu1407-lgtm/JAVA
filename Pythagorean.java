import java.util.Scanner;

public class Pythagorean {
    static boolean triplet(int a, int b, int c){

        if (a*a + b*b == c*c)
            return true;
        if (a*a + c*c == b*b)
            return true;
        if (b*b + c*c == a*a)
            return true;

        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter three numbers: ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (triplet(a, b, c))
            System.out.println("Pythagorean Triplet");
        else
            System.out.println("Not a Pythagorean Triplet");
    }
}
