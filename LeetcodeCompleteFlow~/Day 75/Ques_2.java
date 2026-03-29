import java.util.*;
class Ques_2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> h=new HashSet<>();
        int left=0;
        for(int i=0;i<nums.length;i++){
            while(h.contains(nums[i])){
                if(nums[left]==nums[i] && Math.abs(left-i)<=k){
                    return true;
                }
                h.remove(nums[left]);
                left++;
            }
            h.add(nums[i]);
        }
        return false;
    }
}