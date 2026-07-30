import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = in.nextLine();

        String rev = ""; 

        for (int i = str.length() - 1; i >=0; i--){
            rev += str.charAt(i);
        }

        if (str.equals(rev)){
            System.out.println("The string is a palindrome. ");
        } else{
            System.out.println("The string is not a Palindrome");
        }

        in.close();

    }
    
}
