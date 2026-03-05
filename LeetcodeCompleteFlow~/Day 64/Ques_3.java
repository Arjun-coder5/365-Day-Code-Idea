public class Ques_3 {
  public static void main(String[] args) {
    
  }
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Create a frequency array. 
        // Range is -10,000 to 10,000, so we need 20,001 slots.
        int[] freq = new int[20001];
        int offset = 10000;

        // 2. Count how many times each number appears
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i] + offset; 
            freq[index]++;
        }

        int[] ans = new int[k];
        
        // 3. Find the 'k' highest frequencies
        for (int i = 0; i < k; i++) {
            int maxFreq = -1;
            int maxIdx = -1;

            // Search the freq array for the current highest count
            for (int j = 0; j < freq.length; j++) {
                if (freq[j] > maxFreq) {
                    maxFreq = freq[j];
                    maxIdx = j;
                }
            }

            // Save the number (don't forget to subtract the offset back!)
            ans[i] = maxIdx - offset;

            // "Erase" this one so we find the NEXT highest in the next loop
            freq[maxIdx] = -1;
        }

        return ans;
    }
}
