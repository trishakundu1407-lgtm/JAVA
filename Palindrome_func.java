import java.util.Scanner;

public class Palindrome_func {
    
    static boolean palindrome(int num){
        int original = num;
        int reverse = 0;

        while (num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        if (palindrome(num))
            System.out.println("Palindrome");
        else
            System.out.print("Not palindrome");
    }
}
