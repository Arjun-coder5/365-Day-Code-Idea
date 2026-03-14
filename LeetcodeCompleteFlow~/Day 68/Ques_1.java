import java.util.*;

public class Ques_1 {
  public static void main(String[] args) {
    
  }
    public String getHappyString(int n, int k) {
       List<String> ans = new ArrayList<>();
       track("",n,k,ans);
       if(ans.size()<k)return "";
       else return ans.get(k-1);
    }
    public void track(String current,int n,int k,List<String> ans){
        if(ans.size()==k)return;
        if(current.length()==n){
            ans.add(current);
            return;
        }
        for(char ch : new char[]{'a','b','c'}){
            if(current.length()>0&&current.charAt(current.length()-1)==ch){
                continue;
            }
            track(current+ch,n,k,ans);
        }
    }
}
