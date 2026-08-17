import java.util.Scanner;

public class Prime {
    static boolean prime(int num){

    if (num <= 1)
        return false;

    for( int i = 2; i < num; i++){
        if (num % i == 0)
            return false;
    }

    return true;
}
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (prime(num))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
