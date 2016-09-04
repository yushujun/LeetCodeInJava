public class Solution {
    public boolean isIsomorphic(String s, String t) {
       Map<Character,Character> map1 = new HashMap<>();
       Map<Character,Integer> map2 = new HashMap<>();
       for(int i = 0;i < s.length();i++){
           Character c1 = s.charAt(i);
           Character c2 = t.charAt(i);
           if(!map1.containsKey(c1)){
               if(map2.get(c2) != null) return false;
               map1.put(c1,c2);
               map2.put(c2,1);
           } else if(map1.get(c1) != c2) return false;
       }
       return true;
    }
}
time complexity:O(n)
space complexity:O(n)

public class Solution {
    public boolean isIsomorphic(String s, String t) {
       Map<String,Integer> map = new HashMap<>();
       for(Integer i = 0;i < s.length();i++){
           Character c1 = s.charAt(i);
           Character c2 = t.charAt(i);
           if(map.put(c1+"",i) != map.put(c2+"#",i)) return false;
       }
       return true;
    }
}
time complexity:O(n)
space complexity:O(1)