public class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums)
            xor ^= i;
        int filter = xor&(~(xor-1));
        int val1 = 0,val2 = 0;
        for(int i : nums){
            if((i&filter) == 0)
                val1 ^= i;
            else val2 ^= i;
        }
        return new int[]{val1,val2};
    }
}
time complexity:O(n)
space complexity:O(1)