public class Solution {
    public String intToRoman(int num) {
        final int[] vals = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        final String[] strs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(num > 0){
            while(num >= vals[i]){
                sb.append(strs[i]);
                num -= vals[i];
            }
            i++;
        }
        return sb.toString();
    }
}
time complexity:O(k)
space complexity:O(k)