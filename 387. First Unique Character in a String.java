public class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < chars.length;i++){
            if(!map.containsKey(chars[i]))
                map.put(chars[i],1);
            else 
                map.put(chars[i],map.get(chars[i])+1);
        }
        for(int i = 0;i < chars.length;i++){
            if(map.get(chars[i]) == 1) return i;
        }
        return -1;
    }
}
time complexity:O(n)
space complexity:O(n)

public class Solution {
    public int firstUniqChar(String s) {
        int[] book = new int[26];
        for(int i = 0;i < s.length();i++)
            book[s.charAt(i)-'a']++;
        for(int i = 0;i < s.length();i++)
            if(book[s.charAt(i)-'a'] == 1)
                return i;
        return -1;
    }
}
time complexity:O(n)
space complexity:O(n)