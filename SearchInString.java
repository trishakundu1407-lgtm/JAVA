import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = sc.nextLine();

        System.out.println("Enter string to search: ");
        char key = sc.next().charAt(0);

        int position = -1;

        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == key){
                position = i;
                break;
            }
        }

        if (position != -1){
            System.out.println("Character found at " + position);
        }else{
            System.out.println("character not found");
        }
        sc.close();
    }
}
