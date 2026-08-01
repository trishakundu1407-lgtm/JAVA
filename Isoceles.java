import java.util.Scanner;

public class Isoceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of side: ");
        double side = in.nextFloat();

        System.out.println("Enter the base: ");
        double base = in.nextFloat();

        double area = (base / 4.0) * Math.sqrt((4 * side * side) - (base * base));
        System.out.println("Area = " + area);

        in.close();
    }
}

