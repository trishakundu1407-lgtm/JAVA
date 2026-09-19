public class Ceiling {
    public static void main(String[] args) {
       
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int key = 15;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] == key) {
                System.out.println("Ceiling is " + arr[mid]);
                return;
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.println("Ceiling is: " + arr[start]);

    }
    
}
