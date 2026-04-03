import java.util.*;
class Ques_2 {
    public int[] finalPrices(int[] prices) {
     Stack<Integer> st = new  Stack<>();
     for(int i = 0;i<prices.length;i++){
        while(!st.isEmpty()&&prices[st.peek()]>=prices[i]){
         int idx = st.pop();
         prices[idx] -= prices[i];
        }
        st.push(i);
     }
     return prices;
    }
}