public class Trapping_Rain_Water {
  public static void main(String[] args) {
    int[] arr = {3, 0, 1, 2, 5};
    int n = arr.length;
    System.out.println(trap(arr, n)); // Output: 6
  }

  public static int trap(int[] arr, int n) {
    int[] leftMax = new int[n];
    int[] rightMax = new int[n];

    // Step 1: Fill leftMax[]
    leftMax[0] = arr[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
    }

    // Step 2: Fill rightMax[]
    rightMax[n - 1] = arr[n - 1];
    for (int i = n - 2; i >= 0; i--) {
      rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
    }

    // Step 3: Calculate water trapped
    int res = 0;
    for (int i = 0; i < n; i++) {
      res += Math.min(leftMax[i], rightMax[i]) - arr[i];
    }

    return res;
  }
}
