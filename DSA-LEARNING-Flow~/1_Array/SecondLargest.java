public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        
        if (arr.length < 2) {
            System.out.println("Array should have at least 2 elements");
            return;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}