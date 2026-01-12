public class InfiniteArraySearch {
    static int binarySearch(int[] arr, int x, int low, int high) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
    static int search(int[] arr, int x) {
        if (arr[0] == x)
            return 0;

        int i = 1;

        while (i < arr.length && arr[i] < x) {
            i = i * 2;
        }
        int high = Math.min(i, arr.length - 1);
        int low = i / 2 + 1;

        return binarySearch(arr, x, low, high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 15, 18, 21, 25, 30, 35, 40};

        int x = 18;

        int result = search(arr, x);

        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " + result);
    }
}
