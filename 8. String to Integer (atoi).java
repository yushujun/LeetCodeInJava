public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.isEmpty()) return 0;
        int i = 0,base = 0,sign = 1;
        while(i < str.length() && str.charAt(i) == ' ') i++;
        if(i < str.length() && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            sign = str.charAt(i++) == '-' ? -1 : 1;
        }
        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            if((base>Integer.MAX_VALUE/10)||(base==Integer.MAX_VALUE/10 && str.charAt(i)>'7')) {
                if(sign == 1) return Integer.MAX_VALUE;
                else if(sign == -1) return Integer.MIN_VALUE;
            }
            base = 10*base+str.charAt(i++)-'0';
        }
        return base*sign;
    }
}
time complexity:O(n)
space complexity:O(1)