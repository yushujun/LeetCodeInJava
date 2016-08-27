public class Solution {
  public static int[] plusOne(int[] digits) {
    int i = digits.length-1;
    digits[i]+=1;
    while(digits[i] == 10 && i > 0){
        digits[i] = 0;
        digits[i-1]++;
        i--;
    }
    if(digits[0] == 10){
        int[] ans = new int[digits.length+1];
        digits[0] = 0;
        ans[0] = 1;
        for(int j = 0; j < digits.length;j++){
            ans[j+1] = digits[j];
        }
        return ans;
    } else {
        return digits;
    }
  }
}
time complexity:O(n)
space complexity:O(n)