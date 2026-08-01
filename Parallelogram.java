import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length: ");
        float length = in.nextFloat();

        System.out.println("Enter the base: ");
        float base = in.nextFloat();

        float area = length * base ;
        System.out.println("Area = " + area);

        in.close();
    }
}
