import java.util.Scanner;

public class Area_func {

    static double area(double r) {
        return Math.PI * r * r;
    }

    static double circumference(double r) {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = in.nextDouble();

        double a = area(r);
        double c = circumference(r);

        System.out.println("Area = " + a);
        System.out.println("Circumference = " + c);
    }
}