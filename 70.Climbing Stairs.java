no-recursion
public class Solution {
    public int climbStairs(int n) {
     int first = 0,second = 1;
     for(int i = 1; i <= n; i++){
         int sum = first + second;
         first = second;
         second = sum;
     }
     return second;
    }
}

public class Solution {
    public int climbStairs(int n) {
     int first = 1,second = 1;
     for(int i = 2; i <= n; i++){
         second = first + second;
         first = second - first;
     }
     return second;
    }
}
time complexity:O(n)
space complexity:O(1)

recursion:
public class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 0 )
            return 1;
        return climbStairs(n-1)+climbStairs(n-2);
    }
}
time comlexity:O(2^n)  //TLE