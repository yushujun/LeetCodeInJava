dp:
public class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        int n = nums.length;
        Arrays.fill(dp,n+1);
        dp[0] = 0;
        int lastReach = 0;
        for(int i = 0; i < n-1; i++){
            int coverLength = nums[i];
            if(i+coverLength <= lastReach) continue;
            if(i+coverLength >= n-1) return 1+dp[i];
            for(int j = lastReach+1; j <= i+coverLength; j++)
                dp[j] = 1+dp[i];
            lastReach = i+coverLength;
        }
        return dp[n-1];
    }
}
time complexity:O(n)
space complexity:O(n)

bfs:
public class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n < 2) return 0;
        int cur = 0,curMax = 0,nextMax = 0,level = 0;
        while(cur <= nextMax){
            level++;
            while(cur <= nextMax){
                curMax = Math.max(curMax,cur+nums[cur]);
                if(curMax >= n-1) return level; 
                cur++;
            }
            nextMax = curMax;
        }
        return 0;
    }
}
time complexity:O(n)
space complexity:O(1)

greedy:
public class Solution {
    public int jump(int[] nums) {
        int level = 0,max = 0,end = 0;
        for(int i = 0; i < nums.length-1; i++){
            max = Math.max(max,i+nums[i]);
            if(i == end){
                level++;
                end = max;
            }
        }
        return level;
    }
}
time complexity:O(n)
space complexity:O(1)
其实bfs和greedy都是贪心的思想，每次都是取最长距离，然后更新最长距离和跳数
如果这道题改成，跳到最后一个桩的后面也就是跳过n个桩,并且不保证输入能跳成功，失败返回-1的话，
我们只需要比较max>=n+1,如果是则返回level,否则返回-1