import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temp in F");
        float tempF = in.nextFloat();
        float tempC = (tempF - 32) * 5/9;
        System.out.println(tempC);
    }
}
