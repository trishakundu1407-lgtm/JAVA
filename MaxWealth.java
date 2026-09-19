import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {
        
        int[][] accounts = {
           {1, 2, 3},
           {3, 2, 1},
           {5, 0, 0}  
        };

        int MaxWealth = 0;

        for(int i = 0; i <accounts.length; i++){
            int sum = 0;

            for(int j = 0; j < accounts[i].length; j++ ){
                sum = sum + accounts[i][j];
            }
            if (sum > MaxWealth){
                MaxWealth = sum;
            }

        }
        System.out.println("The maximum wealth is: " + MaxWealth);
    }
}
