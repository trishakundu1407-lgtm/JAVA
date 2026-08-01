import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int negativeSum = 0;
        int positiveEvenSum = 0;
        int positiveOddSum = 0;

        do{
            System.out.println("Enter a number: ");
            num = in.nextInt();

            if (num > 0 && num % 2 == 0){
                positiveEvenSum += num;
            }
            else if (num > 0 && num % 2 != 0){
                positiveOddSum += num;
            }
            else if (num < 0) {
                negativeSum += num;
            }

            } while (num != 0);

        System.out.println("Sum of negative numbers = " + negativeSum);
        System.out.println("Sum of positive even numbers = " + positiveEvenSum);
        System.out.println("Sum of positive odd numbers = " + positiveOddSum);

        in.close();


    }
}
