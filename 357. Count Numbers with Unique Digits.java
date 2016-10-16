public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
       if(n == 0) return 1;
       int uniqueDigits = 9,availableNum = 9;
       int res = 10;
       for(int i = 2;i <= n; i++){
           uniqueDigits *= availableNum;
           res += uniqueDigits;
           availableNum--;
       }
       return res;
    }
}
time complexity:O(logn)
space complexity:O(1)

recursion:
public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
       if(n == 0) return 1;
       if(n > 10) n = 10;
       return helper(n);
    }
    public int helper(int n){
        if(n == 1) return 10;
        int res = 9;
        for(int digit = 9,i = 1; i < n; i++,digit--)
            res *= digit;
        return helper(n-1)+res;
    }
}
time complexity:O(logn)
space complexity:O(1)