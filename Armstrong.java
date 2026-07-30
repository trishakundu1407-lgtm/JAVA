import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = in.nextInt();

        System.out.print("Enter the ending number: ");
        int end = in.nextInt();

        for (int i = start; i <= end; i++) {

            int temp = i;
            int sum = 0;

            while (temp > 0) {

                int digit = temp % 10;
                sum = sum + (digit * digit * digit);
                temp = temp / 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

        in.close();
    }
}