import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input principal amt: "); 
        float principal = in.nextFloat();

        System.out.println("Input rate");
        float rate = in.nextFloat();

        System.out.println("Enter time");
        float time = in.nextFloat();

        float si = (principal * rate * time)/100;
        System.out.println("the si is: " + si);

        in.close();
    
    }
}
