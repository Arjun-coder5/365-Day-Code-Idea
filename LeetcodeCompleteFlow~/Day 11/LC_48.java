import java.util.Arrays;

public class LC_48 {
  public static void main(String[] args) {
    int[][] arr = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    // Print original matrix
    System.out.println("Original:");
      for (int i = 0; i < arr.length; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }

    // Step 1: Transpose
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    // Print after transpose
    System.out.println("\nAfter Step 1 (Transpose):");
     for (int i = 0; i < arr.length; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }
    // Step 2: Reverse each row
   for (int i = 0; i < arr.length; i++) {
    int left = 0, right = arr[i].length - 1;
    while (left < right) {
    int temp = arr[i][left];
    arr[i][left] = arr[i][right];
    arr[i][right] = temp;
    left++;
    right--;
  }
}
    System.out.println("\n90 DEGREE RORATE :");
      for (int i = 0; i < arr.length; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }
  }
}
