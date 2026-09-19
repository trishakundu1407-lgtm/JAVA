import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.println("Enter element to search: ");
        int key = sc.nextInt();

        System.out.println("Enter start index: ");
        int start = sc.nextInt();

        System.out.println("Enter end index: ");
        int end = sc.nextInt();

        int position = -1;

        for(int i = start ; i <=end; i++){
            if(arr[i] == key){
                position = i;
                break;
            }
        }
        if (position != -1){
            System.out.println("Element found at index" + position);
        }else{
            System.out.println("Element not found at the given range");
        }
        
        sc.close();
    }
}
