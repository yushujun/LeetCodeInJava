public class Solution {
public boolean wordPattern(String pattern, String str) {
        Set<Character> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        String[] strArr = str.split(" ");
        if(strArr.length != pattern.length()) return false;
        for(int i = 0;i < strArr.length;i++){
            if(set1.add(pattern.charAt(i)) != set2.add(strArr[i]))
                return false;
        }
        return true;
    }
}
time complexity:O(n)
space complexity:O(n)

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        String[] strArr = str.split(" ");
        if(strArr.length != pattern.length()) return false;
        for(Integer i = 0;i < strArr.length;i++){
            if(map1.put(pattern.charAt(i),i) != map2.put(strArr[i],i))
                return false;
        }
        return true;
    }
}
time complexity:O(n)
space complexity:O(n)

