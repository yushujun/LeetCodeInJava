public class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        if(n != t.length())
            return false;
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int[] alp = new int[26];
        for(int i = 0; i < n;i++){
            alp[sChar[i]-'a']++;
            alp[tChar[i]-'a']--;
        }
        for(int count : alp){
            if(count != 0)
                return false;
        }
        return true;
    }
}
time complexity: O(n)
space complexity: O(1)

About follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
I think first to sort s and t,and compare every character in s and t is equal can slove unicode characters
public class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        if(n != t.length())
            return false;
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int i = 0;
        for(; i < n;i++){
            if(ch1[i] != ch2[i])
                break;
        }
        if(i == ch1.length)
            return true;
        return false;
    }
}
time complexity:it's up to sort time,if we use heap sort or quick sort is O(nlogn)
space complexity:O(1)