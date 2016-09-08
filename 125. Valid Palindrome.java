public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) return true;
        for(int i = 0, j = s.length()-1; i < j; ){
            char c1 = s.charAt(i),c2 = s.charAt(j);
            if(!Character.isLetterOrDigit(c1)) i++;
            else if(!Character.isLetterOrDigit(c2)) j--;
            else if(Character.isLetterOrDigit(c1) && Character.isLetterOrDigit(c2) && Character.toLowerCase(c1) != Character.toLowerCase(c2)) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
time complexity:O(n)
space complexity:O(1)