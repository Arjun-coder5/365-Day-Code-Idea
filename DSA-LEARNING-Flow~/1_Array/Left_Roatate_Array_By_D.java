import java.util.Arrays;
public class Left_Roatate_Array_By_D {
            // Approach 1:
           //  This Approach takes time O(n^2):
           // Use two loops :
//   public static void main(String[] args) {
//     int arr[] = {1,2,3,4,5};
//     int n = 5;
//     int d = 2;
//    Left_Rotate(arr, n, d);
//     System.out.println("Array after " + d + " left rotations: " + Arrays.toString(arr));
//   }
// static   void Left_Rotate_one(int[] arr,int n){
//     int temp = arr[0];
//     for(int i = 1;i<n;i++){
//       arr[i-1] = arr[i];
//     }
//     arr[n-1] = temp;
//   }
//   static void Left_Rotate(int[] arr,int n,int d){
//     for(int i = 0;i<d;i++){
//       Left_Rotate_one(arr,n);
//     }
//   }
           // Approach 2:
           //  This Approach takes time O(n):
           // Use one loop and creating an temporary array :
//  public static void main(String[] args) {
//   int arr[] = {1,2,3,4,5};
//     int n = arr.length;
//     int d = 2;
//      Left_Rotate(arr, n, d);
//     System.out.println("Array after " + d + " left rotations: " + Arrays.toString(arr));
//  }
//  static void Left_Rotate(int[] arr,int n,int d){
//   int temp[] = new int[d];
//   for(int i = 0;i<d;i++){
//       temp[i] = arr[i];
//   }
//   for (int i = d; i < n; i++) {
//      arr[i-d] = arr[i];
//   }
//   for(int i = 0;i<d;i++){
//     arr[n-d+i] = temp[i];
//   }
  // }
            // Approach 3:
           //  This Approach takes time theta(N) and space (o(1)):
           // Use one fxn and call it three times with different work  :
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
    int n = arr.length;
    int d = 2;
     Left_Rotate(arr, n, d);
    System.out.println("Array after " + d + " left rotations: " + Arrays.toString(arr));
  }
  static void Left_Rotate(int[] arr,int n,int d){
     d = d % n;
    Reverse(arr,0,n-1);
    Reverse(arr,d,n-1);
    Reverse(arr,0,d-1);
  }
  static void Reverse(int[] arr,int low,int high){
       while(low<high){
       int temp = arr[low];
       arr[low]=  arr[high];
       arr[high] = temp;
        low++;
        high--;
       }
  }

 
}
