public class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        String s = 1+"";
        n--;
        while(n != 0){
            for(int i = 0; i < s.length();i++){
                int j = i;
                while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1))   i++;
                sb.append((i-j+1)+""+s.charAt(i));
            }
            s = sb.toString();
            sb = new StringBuilder();
            n--;
         }
         return s;
    }
}
time complexity:O(n)
space complexity:O(1)