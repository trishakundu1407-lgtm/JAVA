import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter your first number");
        int n1 = in.nextInt();

        System.out.println("enter your second number");
        int n2 = in.nextInt();

        int max = Math.max(n1, n2);

        while (true){
            if (max % n1 == 0 && max % n2 ==0){
                System.out.println(max);
                break;
            }
            max++;
        }

        in.close();


    }
}
