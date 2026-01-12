import java.util.Scanner;

public class Frequency_Count {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size of the arrray");
   int n = sc.nextInt();
   int count  = 1;
   int[] arr = new int[n];
   for(int i = 0;i<n;i++){
    arr[i] = sc.nextInt(); 
   }
   for(int i = 1;i<n;i++){
    if(arr[i]==arr[i-1]){
      count++;
    }else{
      System.out.println(arr[i - 1] + " -> " + count);
       count = 1;
    }
   }
  System.out.println(arr[n - 1] + " -> " + count);

  }
}
