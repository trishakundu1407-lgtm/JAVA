
public class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 80;

        int start = 0;
        int end = arr.length - 1;

        int position = -1;

        while(start <= end){

            int mid = start + (end - start)/2;

            if (arr[mid] == key) {
                position = mid;
                break;
            }
            else if (arr[mid] < key ){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if (position != -1){
            System.out.println("Element found at index: " + position);
        } else{
            System.out.println("Element not found");
        }
    }
}
