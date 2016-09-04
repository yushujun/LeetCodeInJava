public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x;
        int reverse = 0;
        while(temp > 0){
            reverse = reverse*10 + temp%10;
            temp /= 10;
        }
        return x == reverse;
    }
}
time complexity:O(logn) base 10
space complexity:O(1)