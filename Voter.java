import java.util.Scanner;

public class Voter {
    static boolean Voter (int age){
        if (age >= 18)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        if (Voter(age))
            System.out.println("Eligible to vote");
        else
            System.out.println("Not eligible to vote");
    }
}
