public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n == 0 ? false :(int)Math.pow(2,(int)(Math.log(n)/Math.log(2))) == n;
    }
}

public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n&(n-1))==0;
    }
}
time complexity:O(1)
