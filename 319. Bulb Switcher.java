public class Solution {
    public int bulbSwitch(int n) {
        int on = 0;
        for(int i = 1; i * i <= n; i++)
            on++;
        return on;
    }
}
time complexity:O(n^1/2)
space complexity:O(1)

public class Solution {
    public int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
}
time complexity:O(1)