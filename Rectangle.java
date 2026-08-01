import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length: ");
        float length = in.nextFloat();

        System.out.println("Enter the breadth: ");
        float breadth = in.nextFloat();

        float area = length * breadth ;
        System.out.println("Area = " + area);

        in.close();
    }
}
