import java.util.Scanner;

public class VowelConstant{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter an alphabet: ");
        char ch = in.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Is a vowel");
        } else{
            System.out.println("Is a consonant");
        }

        in.close();
    }
}