import java.util.Scanner;

public class Max_Min{
        
        static int maximum(int a, int b, int c){
            int max =a;

            if (b > max)
                max =b;

            if (c > max)
                max = c;

            return max;
        }
        static int minimum(int a, int b, int c){
            int min =a;

            if(b < min)
                min =b;

            if(c < min)
                min =c;
            return min;
        }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum = " + maximum(a,b,c));
        System.out.println("Minimum = " + minimum(a,b,c));
     }
}