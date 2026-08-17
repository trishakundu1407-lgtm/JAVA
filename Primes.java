import java.util.Scanner;

public class Primes {
    static boolean prime(int num){
        if (num <= 1)
            return false;
        for(int i = 2; i < num; i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }

    static void primes(int start, int end){
        for (int i = start; i <= end; i++){

            if (prime(i))  
                System.out.print(i + " ");
                
            }
        }
        public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = in.nextInt();

        System.out.print("Enter ending number: ");
        int end = in.nextInt();

        primes(start, end);
    }
}
