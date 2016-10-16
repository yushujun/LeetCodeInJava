public class Solution {
    public int maxProduct(String[] words) {
        int[] bitmask = new int[words.length];
        int index = 0;
        for(String w : words){
            for(char c : w.toCharArray())
                bitmask[index] |= 1 << c - 'a';
            index++;
        }
        int res = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){
                if((bitmask[i] & bitmask[j]) == 0)
                    res = Math.max(res,words[i].length()*words[j].length());
            }
        }
        return res;
    }
}
time complexity:O(n*m) m is length of elements in words
space complexity:O(n)