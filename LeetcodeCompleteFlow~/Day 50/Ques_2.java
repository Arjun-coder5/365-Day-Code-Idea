class Solution {
  public static void main(String[] args) {
    String s = "Arjun";
    longestBalanced(s);
  }
    public static int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] count = new int[26];
            int distinct = 0;
            int maxFreq = 0; 

            for (int j = i; j < n; j++) {
                int idx = s.charAt(j) - 'a';
                if (count[idx] == 0) {
                    distinct++;
                }
                count[idx]++;
                
                
                maxFreq = Math.max(maxFreq, count[idx]);

              
                if (maxFreq * distinct == (j - i + 1)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}