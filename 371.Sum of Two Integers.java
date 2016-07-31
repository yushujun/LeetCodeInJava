iteration:
public class Solution {
    public int getSum(int a, int b) {
        int ans = a ^ b;
        int c = a & b;
        while(c != 0){
            c <<= 1;
            int ans_prim = ans ^ c;
            c = ans & c;
            ans = ans_prim;
        }
        return ans;
    }
}
recursion:
public class Solution {
    public int getSum(int a, int b) {
       return b == 0 ? a^b : getSum(a^b,(a&b)<<1);
    }
}
思路：
如果a&b==0的时候,说明a^b=a+b,比如a=2它的二进制位10,b=1它的二进制位01,a^b=a+b=11=3
如果a&b!=0的时候,说明a和b有相同的为需要进位在把值加给a^b,所以需要<<1来进位,如果进位后
还需要进位则再次<<1然后相加,所以这个过程中能够看出有重复的操作则可以写成迭代或者递归。
