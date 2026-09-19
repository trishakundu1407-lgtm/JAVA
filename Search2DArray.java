import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of colums: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements: ");

        for( int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for( int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){ 
            
                if (arr[i][j] == key){
                    System.out.println("Element found at row: " + i + "and column at: " + j);
                    found = true;
                    break;
                }
            }
            
            if (found){
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
