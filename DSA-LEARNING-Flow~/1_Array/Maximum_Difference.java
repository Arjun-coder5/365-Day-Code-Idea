public class Maximum_Difference {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int n = arr.length;
  int result =  maxDiff(arr, n);
  System.out.println(result);
  }
  // static int maxDiff(int[] arr,int n){
  //   int res = arr[1]-arr[0];
  //   for(int i = 0;i<n-1;i++){
  //     for(int j = i+1;j<n;j++){
  //      res = Math.max(res,arr[j]-arr[i]);
  //     }   
  //   }
  // return res;
  // }
  // Approach 2:
  static int maxDiff(int[] arr, int n) {
  int minVal = arr[0];
  int res = arr[1] - arr[0];

  for (int j = 1; j < n; j++) {
    res = Math.max(res, arr[j] - minVal);
    minVal = Math.min(minVal, arr[j]);
  }

  return res;
}

  
}
