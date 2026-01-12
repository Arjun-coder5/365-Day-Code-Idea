public class Stock_Buy_And_Sell {
  public static void main(String[] args) {
    int[] price = {1,5,3,8,12};
    int n = price.length;
    int ans = maxProfit(price,n);
    System.out.println(ans);
  }
  public  static int maxProfit(int[] price,int n){
     int profit = 0;
     for(int i = 1;i<n;i++){
      if(price[i]>price[i-1]){
        profit += (price[i]-price[i-1]);
      }
     }
      return profit;
  }
 
}
