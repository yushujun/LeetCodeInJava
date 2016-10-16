public class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] src = s.toCharArray();
        char[] des = t.toCharArray();
        int i,j;
        for(i = 0,j = 0; j < des.length && i < src.length;){
            if(src[i] == des[j]) {
                i++;j++;
            } else j++;
        }
        if(i == src.length) return true;
        return false;
    }
}
time complexity:O(n)
space complexity:O(1)

public class Solution {
    public boolean isSubsequence(String s, String t) {
       for(int i = 0, j = -1;i < s.length(); i++){
           j = t.indexOf(s.charAt(i),j+1);
           if(j == -1) return false;
       }
       return true;
    }
}
time complexity:O(n)
space complexity:O(1)

public class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s.length() == 0) return true;
       int i = 0;
       for(char c : t.toCharArray()){
           if(s.charAt(i) == c && ++i == s.length()) return true;
       }
       return false;
    }
}
time complexity:O(n)
space complexity:O(1)