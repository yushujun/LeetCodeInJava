public class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            Character c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            } else 
                map.put(c,map.get(c)+1);
        }
        for(int i = 0; i < t.length();i++){
            Character c = t.charAt(i);
            if(!map.containsKey(c) || map.get(c) == 0) return c;
            else map.put(c,map.get(c)-1);
        }
        return ' ';
    }
}
time complexity:O(n)
space complexity:O(n)

public class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        for(int i = 0;i < s.length();i++)
            result ^= s.charAt(i)^t.charAt(i);
        return (char)(result^t.charAt(t.length()-1));
    }
}
time complexity:O(n)
space complexity:O(1)