public class Solution {
    public int lengthOfLastWord(String s) {
       int len = 0,index = s.length()-1;
       while(index>=0 && s.charAt(index)==' ') index--;
       for(;index>=0 && s.charAt(index)!=' ';index--) len++;
       return len;
    }
}
time complexity:O(n)
space complexity:O(1)