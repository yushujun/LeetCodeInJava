public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            count++;
            n &= n-1;
        }
        return count;
    }
}
public class Solution {
    // you need to treat n as an unsigned value
   public int hammingWeight(int n) {
        int ones = 0;
        while(n!=0) {
          ones = ones + (n & 1);
          n = n>>>1;
        }
        return ones;
    }
}
>>>无符号右移，>>有符号右移
time complexity:O(logn)
space complexity:O(1)