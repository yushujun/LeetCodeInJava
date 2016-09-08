public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0;i < 32;i++){
            result = result<<1;
            if((n&1) == 1) result++;
            n >>>= 1;
        }
        return result;
    }
}
time complexity:O(32)
space complexity:O(1)
java右移会使得符号位补充新符号位的bit值，而左移则不会保存符号位
所以java无符号移动只有>>>