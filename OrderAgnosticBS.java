public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
        int key = 70;

        int start = 0;
        int end = arr.length - 1;

        int position = -1;

        boolean ascending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == key) {
                position = mid;
                break;
                
            }

            if (ascending) {
                if (arr[mid] < key) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            } else{
                if (arr[mid] < key) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            
        }
        if (position != -1) {
            System.out.println("Element found at index: " + position);
        } else{
            System.out.println("Element not found");
        }



    }
    
}
