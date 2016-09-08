public class Solution {
    public int trailingZeroes(int n) {
        int result = 0;
        while(n > 0){
            result += n/5;
            n /= 5;
        }
        return result;
    }
}
time complexity:O(logn)
space complexity:O(1)
先计算比如100中能被5整除的个数，有5、10、15...95、100，20个数
然后在计算被25整除的，因为5已经计算一次所以25也只需要计算一次，
然后一次类推，这个方法就很巧妙