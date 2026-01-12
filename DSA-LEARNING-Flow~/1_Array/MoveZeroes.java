public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        
        System.out.print("Original array: ");
        printArray(arr);
        
        // Move zeros to end
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        
        // Fill remaining with zeros
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
        
        System.out.print("After moving zeros: ");
        printArray(arr);
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
