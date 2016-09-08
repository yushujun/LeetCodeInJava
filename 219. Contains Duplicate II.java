HashMap:
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length;i++){
            Integer prev = map.put(nums[i],i);
            if(prev != null && (i-prev)<=k) return true;
        }
        return false;
    }
}
time complexity:O(n)
space complexity:O(n)

HashSet:
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       Set<Integer> set = new HashSet<>();
       for(int i = 0;i < nums.length;i++){
           if(i > k) set.remove(nums[i-k-1]);
           if(!set.add(nums[i])) return true;
       }
       return false;
    }
}
time complexity:O(n)
space complexity:O(n)