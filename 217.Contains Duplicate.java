public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int val : nums)
            set.add(val);
        if(set.size() < nums.length)
            return true;
        return false;
    }
}
比较set.size和nums.length要比set.contains(val)效率要高
time complexity:O(n)
space complexity:O(n)
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1;i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}
time:6ms
time complexity:O(nlogn)
space complexity:O(1)