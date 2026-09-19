import java.util.Scanner;

public class RunningSum {
    static int[] runningSum( int[] nums){
        for (int i = 1; i < nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        } 
        return nums;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = in.nextInt();

        int[] nums = new int[n];
        System.out.println("Emter your elements: ");
        for(int i = 0; i< nums.length; i++){
            nums[i] = in.nextInt();
        }

        int[] result = runningSum(nums);
        System.out.println("Running Sum: ");

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i] + " ");
        }

        
    }
}
