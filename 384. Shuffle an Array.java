public class Solution {
    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;

    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int n = nums.length;
        int[] rand = new int[n];
        for(int i = 0; i < n; i++){
            int j = (int)(Math.random()*(i+1));
            rand[i] = rand[j];
            rand[j] = nums[i];
        }
        return rand;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */