import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("ENTER RADIUS TO CALC IT'S AREA ");
    float radius = in.nextFloat();
    float area = 3.14f * radius * radius;
    System.out.println(area);
    in.close();
    }
}
