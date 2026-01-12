public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        System.out.println("Largest element: " + largest);
    }
}