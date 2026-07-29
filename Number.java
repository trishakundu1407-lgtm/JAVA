import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        if (num % 2 ==0){
             System.out.println("number is even");
        } else{
            System.out.println("Number is odd");
        }
        in.close();
    }
}
