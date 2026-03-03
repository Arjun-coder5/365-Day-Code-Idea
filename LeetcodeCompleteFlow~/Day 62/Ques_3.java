import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Ques_3 {
  public static void main(String[] args) {
    
  }
    private int func(Stack<Integer> a,Stack<Integer> b){
        List<Integer> a2=new ArrayList<>(),b2=new ArrayList<>();
        int n=a.size(),n2=b.size();
        for(int i=n-1;i>=0;i--) a2.add(a.get(i));
        for(int i=n2-1;i>=0;i--) a2.add(b.get(i));

        for(int i=n2-1;i>=0;i--) b2.add(b.get(i));
        for(int i=n-1;i>=0;i--) b2.add(a.get(i));

        for(int i=0;i<n+n2;i++){
            if(a2.get(i)>b2.get(i)) return -1;
            if(a2.get(i)<b2.get(i)) return 1;
        }
        return 0;

    }
    public String largestNumber(int[] nums) {
        List<Stack<Integer>> num=new ArrayList<>();
        for(int i: nums){
            Stack<Integer> arr=new Stack<>();
            int e=i;
            if(e==0) arr.push(0);
            while(e!=0){
                arr.push(e%10);
                e/=10;
            }
            num.add(arr);
        }
        Collections.sort(num,(a,b) -> func(a,b));
        //System.out.println(num);
        StringBuilder ans=new StringBuilder();
        for(var i: num){
            while(!i.isEmpty()){
                int ele=i.peek();
                i.pop();
                if(ele==0&&ans.length()==0)continue;
                ans.append((char)(ele+'0'));
            }
        }
        if(ans.length()==0) ans.append('0');
        return ans.toString();
    }
}

