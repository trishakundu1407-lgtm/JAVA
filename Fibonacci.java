import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of terms: ");
        int n = in.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++){
            System.out.println(first);
        

        int temp = first + second;
        first = second;
        second = temp;
        }

        in.close();
    }
}
