public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        int j = 0;
        while(true){
            Character c = ' ';
            for(int i = 0;i < strs.length;i++){
                if(j == strs[i].length()) return sb.toString();
                if(i == 0) c = strs[i].charAt(j);
                else if(c != strs[i].charAt(j)) return sb.toString();
            }
            sb.append(c);
            j++;
        }
    }
}
time complexity:O(n^2)
space complexity:O(1)

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
       if(strs == null || strs.length <= 0) return result;
       int minSize = strs[0].length(),minIndex = 0;
       for(int i = 1;i < strs.length;i++)
           if(strs[i].length() < minSize){
               minSize = strs[i].length();
               minIndex = i;
           }
       for(int i = 0;i < strs.length-1;i++){
           while(!strs[i].substring(0,minSize).equals(strs[i+1].substring(0,minSize)))   minSize--;
       }
       result = strs[minIndex].substring(0,minSize);
       return result;
    }
}
time complexity:O(n^2)
space complexity:O(1)
