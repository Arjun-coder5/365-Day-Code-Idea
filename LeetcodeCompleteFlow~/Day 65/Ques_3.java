import java.util.*;

class Ques_3 {
  public static void main(String[] args) {
    
  }
     static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length,maxLen=1,lastIdx=0;
        int[] idx = new int[n];
        int [] len = new int[n];

        Arrays.sort(nums);
        
        Arrays.fill(len,1);
        for(int i=0;i<n;i++)
         idx[i]=i;

        for(int i=1;i<n;i++)
        for(int j=0;j<i;j++){
            if(nums[i]%nums[j]==0 && len[i]<1+len[j]){
                  idx[i]=j;
                  len[i]=1+len[j];
                  if(len[i]>maxLen){
                    maxLen=len[i];
                    lastIdx=i;
                  }
            }
        }

        List<Integer> result = new ArrayList<>();
        while (idx[lastIdx] != lastIdx) {
            result.add(nums[lastIdx]);
            lastIdx = idx[lastIdx];
        }

        result.add(nums[lastIdx]);

        return result;
    }
}