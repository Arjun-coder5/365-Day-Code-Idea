public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.print("Original array: ");
        printArray(arr);
        
        // Reverse array
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        System.out.print("Reversed array: ");
        printArray(arr);
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}