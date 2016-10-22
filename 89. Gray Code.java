recursion:
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        if(n == 0) {
            list.add(0);
            return list;
        }
        int[] ans = helper(n);
        for(int i : ans)
            list.add(i);
        return list;
    }
    public int[] helper(int n){
        int[] grayCode = new int[1<<n];
        if(n == 1){
            grayCode[0] = 0;
            grayCode[1] = 1;
            return grayCode;
        }
        int[] last = helper(n-1);
        for(int i = 0; i < last.length; i++){
            grayCode[i] = last[i];
            grayCode[grayCode.length-1-i] = (1<<(n-1))+last[i];
        }
        return grayCode;
    }
}
time complexity:O(n)
space complexity:O(1)

no-recursion:
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < (1<<n); i++)
            ans.add((i>>>1)^i);
        return ans;
    }
}
time complexity:O(n)
space complexity:O(1)