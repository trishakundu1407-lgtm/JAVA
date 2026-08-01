import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter diagonal1 : ");
        float d1 = in.nextFloat();

        System.out.println("Enter the diagonal2 ");
        float d2 = in.nextFloat();

        float area = 0.5f * d1 * d2 ;
        System.out.println("Area = " + area);

        in.close();
    }
}