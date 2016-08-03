iteration:
public class Solution {
    public String convertToTitle(int n) {
    String result = "";
    while(n-- != 0){
      result = (char)('A' + n % 26) + result;
      n /= 26;
    }
    return result;
    }
}
recurision:
public class Solution {
    public String convertToTitle(int n) {
        if (n <= 26) return (char)('A' + n - 1) + "";
        if (n % 26 != 0) return convertToTitle((n / 26)) + (char)('A' + (n % 26) - 1);
        else return convertToTitle((n / 26) - 1) + "Z";
    }
}
alphabet:
public class Solution {
    public String convertToTitle(int n) {
        String alphabet = "ZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] dict = alphabet.toCharArray();
        String result = "";
        while(n != 0){
            result = dict[n%26] + result;
            n = (n-1)/26;
        }
        return result;
    }
}
time complexity:O(logn)
space complexity:O(1)