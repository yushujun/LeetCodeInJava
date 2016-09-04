public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums)
            result ^= i;
        return result;
    }
}
time complexity:O(n)
space complexity:O(1)