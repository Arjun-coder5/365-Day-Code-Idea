public class Leader_in_Array {
  public static void main(String[] args) {
    int[] arr = {5,4,3,2,1};
    int n = arr.length;
    leader(arr,n);
    
  }
  static void leader(int[]arr,int n){
    int current_Leader = arr[n-1];
    System.out.println(current_Leader+" ");
     for(int i = n-2;i>=0;i--){
      if(arr[i]>current_Leader){
        current_Leader = arr[i];
        System.out.println(current_Leader+" ");
      }
     }
  }
}
