public class LC_41{
  public static void main(String[] args) {
    // Find first Missing Positive :

    // Statement - Given an unsorted integer array nums,
     //find the smallest missing positive integer.
   

    //  Use Cyclic Sort :
    int[] arr = {1,2,0};
    System.out.println(call(arr));
  }
  public static int call(int[] arr) {
      int n = arr.length;
      for(int i = 0;i<n;i++){
        while(arr[i]>0&&arr[i]<n&&arr[arr[i]-1]!=arr[i]){
          int temp = arr[arr[i]-1];
          arr[arr[i]-1] = arr[i];
          arr[i] = temp;
        }
      }
      for(int i = 0;i<n;i++){
        if(arr[i]!=i+1){
          return i+1;
        }
      }
      return n+1;
  }
}