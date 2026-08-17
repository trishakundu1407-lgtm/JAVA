import java.util.Scanner;

public class NaturalNum {
    static int sum(int n){
        int total = 0;
        for(int i = 1; i<=n ;i++){
            total= total + i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = in.nextInt();

        int result = sum(n);
        System.out.println("sum = " + result);
    }
}
