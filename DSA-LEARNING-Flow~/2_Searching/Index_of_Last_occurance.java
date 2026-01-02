public class Index_of_Last_occurance {
   public static void main(String[] args) {
      int []arr={1,2,2,2,3,4,5};
      int x=2;
      int low=0;
      int high=arr.length-1;
    int ans = lastOcc(arr, low, high, x);
    System.out.println( "The last occurance of index  of this target is :  " +ans);
   }
   public static int lastOcc(int []arr,int low,int high,int x){
    int mid = high+(low-high)/2;
    if(low>high){
      return -1;
    }
    if(x>arr[mid]){
      return lastOcc(arr,mid+1,high,x);
    }else if(x<arr[mid]){
      return lastOcc(arr, low, mid-1, x);
    }else{
      if(mid==arr.length-1||arr[mid]!=arr[mid+1]){
        return mid;
      }else{
        return lastOcc(arr, mid+1, high, x);
      }
    }
   }
}