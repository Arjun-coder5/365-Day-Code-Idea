public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Check if array is sorted
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        
        System.out.print("Array: ");
        printArray(arr);
        System.out.println("Is sorted: " + isSorted);
        
        // Sort array using bubble sort
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("\nUnsorted array: ");
        printArray(arr2);
        
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - i - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }
        
        System.out.print("Sorted array: ");
        printArray(arr2);
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}