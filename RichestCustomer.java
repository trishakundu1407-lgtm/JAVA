import java.util.Scanner;

public class RichestCustomer {

    static int richest(int[][] accounts) {

        int max = 0;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }

            if (sum > max)
                max = sum;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int m = in.nextInt();

        System.out.print("Enter number of banks: ");
        int n = in.nextInt();

        int[][] accounts = new int[m][n];

        System.out.println("Enter account balances:");

        for (int i = 0; i < accounts.length; i++) {

            for (int j = 0; j < accounts[i].length; j++) {
                accounts[i][j] = in.nextInt();
            }
        }

        int result = richest(accounts);

        System.out.println("Richest Customer Wealth = " + result);
    }
}