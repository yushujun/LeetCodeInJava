hashmap method:
public class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i))
                map.put(i,1);
            else map.put(i,map.get(i)+1);
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq != 3) return key;
        }
        return -1;
    }
}
time complexity:O(n)
space complexity:O(n)

sort method:
public class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i+=3){
            if(i == nums.length-1 || nums[i] != nums[i+2]) return nums[i];
        }
        return -1;
    }
}
time complexity:O(nlogn)
space complexity:O(1)

count bit method:
public class Solution {
    public int singleNumber(int[] nums) {
        int pos = 0,res = 0;
        while(pos <= 31){
            int sum = 0;
            for(int n : nums)
                sum += (n>>pos)&1;
            sum %= 3;
            res |= sum<<pos;
            pos++;
        }
        return res;
    }
}
time complexity:O(n)
space complexity:O(1)