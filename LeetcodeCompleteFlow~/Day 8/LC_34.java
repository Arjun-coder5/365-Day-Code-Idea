import java.util.Arrays;

public class LC_34 {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target))); // Output: [3,4]
    }

    static int[] searchRange(int[] arr, int target) {
        return new int[]{binarySearch(arr, target, true), binarySearch(arr, target, false)};
    }

    static int binarySearch(int[] arr, int target, boolean first) {
        int ans = -1, low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (arr[mid] == target) {
                ans = mid;
                if (first) high = mid - 1;
                else low = mid + 1;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }
}
