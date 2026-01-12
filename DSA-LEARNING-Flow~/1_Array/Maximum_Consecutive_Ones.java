public class Maximum_Consecutive_Ones {
  public static void main(String[] args) {
    int[] arr = {1, 1, 1, 0, 1, 1};
    int n = arr.length;
    int ans = count_ones(arr, n);
    System.out.println(ans);
  }

  public static int count_ones(int[] arr, int n) {
    int res = 0;

    for (int i = 0; i < n; i++) {
      int count = 0;

      for (int j = i; j < n; j++) {
        if (arr[j] == 1)
          count++;
        else
          break;

        res = Math.max(res, count);
      }
    }

    return res; 
  }
}
