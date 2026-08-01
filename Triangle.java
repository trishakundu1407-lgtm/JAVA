import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length: ");
        float length = in.nextFloat();

        System.out.println("Enter the base: ");
        float base = in.nextFloat();

        float area = 0.5f * length * base;

        System.out.println("Area = " + area);

        in.close();
    }
}