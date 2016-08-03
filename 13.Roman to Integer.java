public class Solution {
    public int romanToInt(String s) {
        int result = 0;
        int curVal = 0,preVal = 0;
        for(int i = s.length()-1;i >= 0;i--){
            switch(s.charAt(i)){
                case 'I':
                    curVal = 1;
                    break;
                case 'V':
                    curVal = 5;
                    break;
                case 'X':
                    curVal = 10;
                    break;
                case 'L':
                    curVal = 50;
                    break;
                case 'C':
                    curVal = 100;
                    break;
                case 'D':
                    curVal = 500;
                    break;
                case 'M':
                    curVal = 1000;
                    break;
                default:
                    break;
            }
            if(curVal < preVal){
                result -= curVal;
            } else {
                result += curVal;
            }
            preVal = curVal;
        }
        return result;
    }
}
time complexity: O(n)
space complexity: O(1)