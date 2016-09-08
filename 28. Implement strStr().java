public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) return -1;
        for(int i = 0;i <= haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)) return i; 
        }
        return -1;
    }
}
time complexity:O(n^2)
space complexity:O(1)

public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null|| needle.length() == 0) return 0;
        if(haystack.length() == 0 || needle.length()>haystack.length()) return -1;
        char[] s1 = haystack.toCharArray();
        char[] s2 = needle.toCharArray();
        for(int i = 0;i < s1.length;i++){
            int k = i,j = 0;
            while(k < s1.length && j < s2.length && s1[k++] == s2[j++])
                    ;
            if(j == s2.length && s1[k-1] == s2[j-1]) return i;
        }
        return -1;
    }
}
time complexity:O(n^2)
space complexity:O(1)
最快的还是kmp，time complexity:O(n) space complexity:O(n)