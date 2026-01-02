public class Count_Occu {
  public static void main(String[] args) {
      int []arr={1,2,2,2,3,4,5};
      int x=2;
      int low=0;
      int high=arr.length-1;
    int firstIndex = firstOcc(arr, low, high, x);
    int lastIndex = lastOcc(arr, low, high, x);
    if(firstIndex==-1 || lastIndex==-1){
      System.out.println("Element not found");
    }else{
      int count = lastIndex - firstIndex + 1;
      System.out.println("The count of the element is: " + count);    
    }
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
