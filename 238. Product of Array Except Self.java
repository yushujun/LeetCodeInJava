public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++)
            result[i] = 1;
        int left = 1,right = 1;
        for(int i = 0;i < n;i++){
            result[i] *= left;
            left *= nums[i];
            result[n-1-i] *= right;
            right *= nums[n-1-i];
        }
        return result;
    }
}
time complexity:O(n)
space complexity:O(1)
我们以一个4个元素的数组为例，nums=[a1, a2, a3, a4]。 
想在O(n)时间复杂度完成最终的数组输出，res=[a2*a3*a4, a1*a3*a4, a1*a2*a4, a2*a3*a4]。
比较好的解决方法是构造两个数组相乘：
[1, a1, a1*a2, a1*a2*a3]
[a2*a3*a4, a3*a4, a4, 1]

recursion:
public int[] productExceptSelfRev(int[] nums) {
    multiply(nums, 1, 0, nums.length);

    return nums;
}
private int multiply(int[] a, int fwdProduct, int indx, int N) {
    int revProduct = 1;
    if (indx < N) {
        revProduct = multiply(a, fwdProduct * a[indx], indx + 1, N);
        int cur = a[indx];
        a[indx] = fwdProduct * revProduct;
        revProduct *= cur;
    }
    return revProduct;
}
time complexity:O(n)
space complexity:O(1)