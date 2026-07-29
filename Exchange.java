import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter amount in INR: ");
        int amt = in.nextInt();

        System.out.println("Your amount in USD: " + (amt/83.6f));

        in.close();
    }
}
