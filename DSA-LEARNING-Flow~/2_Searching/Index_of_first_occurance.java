public class Index_of_first_occurance {
   public static void main(String[] args) {
      int []arr={1,2,2,2,3,4,5};
      int x=2;
      int low=0;
      int high=arr.length-1;
    int ans = firstOcc(arr, low, high, x);
    System.out.println( "The first occurance of this target is :  " +ans);
   }
   public static int firstOcc(int []arr,int low,int high,int x){
    int mid = high+(low-high)/2;
    if(low>high){
      return -1;
    }
    if(x>arr[mid]){
      return firstOcc(arr,mid+1,high,x);
    }else if(x<arr[mid]){
      return firstOcc(arr, low, mid-1, x);
    }else{
      if(mid==0||arr[mid-1]!=arr[mid]){
        return mid;
      }else{
        return firstOcc(arr, low, mid-1, x);
      }
    }
   }
}