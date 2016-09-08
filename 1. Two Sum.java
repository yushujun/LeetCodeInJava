public class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length <= 1) return new int[2];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                if(i != j && (nums[i]+nums[j])==target) 
                    return new int[]{i,j};
            }
        }
        return new int[2];
    }
}
time complexity:O(n^2)
space complexity:O(1)

public class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i = 0;i < nums.length;i++){
           if(map.containsKey(target-nums[i])
                return new int[]{map.get(target-nums[i]),i};
           else map.put(nums[i],i);
       }
       return new int[2];
    }
}
time complexity:O(n)
space complexity:O(n)