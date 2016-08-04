public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(!set.contains(n) && n != 1){
            set.add(n);
            int tmp = n;
            int result = 0;
            while(tmp != 0){
                result += Math.pow(tmp%10,2);
                tmp /= 10;
            }
            n = result;
        }
        return n == 1 ? true : false;
    }
}
time complexity:O(1)
space complexity:O(n)