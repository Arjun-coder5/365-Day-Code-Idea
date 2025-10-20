public class LC_35{
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(arr, target)); // Output: 2
    }

    static int searchInsert(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return low; // position to insert
    }
}
