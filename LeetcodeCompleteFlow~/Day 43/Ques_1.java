import java.util.Arrays;

public class Ques_1 {
  public static void main(String[] args) {
   int[] g = {1,2,3};
   int[] s = {1,1};
   Ques_1 q = new Ques_1();
   int result = q.findContentChildren(g, s);
   System.out.println(result);
  }
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);
       int i = 0,j = 0;
       int count = 0;
       while(i<g.length&&j<s.length){
        if(s[j]>=g[i]){
            count++;
            i++;
            j++;
        }else{
            j++;
        }
       }
       return count;
    }
}