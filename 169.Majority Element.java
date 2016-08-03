hashmap method:
public class Solution {
  public static int majorityElement(int[] nums) {
    Map<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length;i++){
      int val = nums[i];
      if(map.containsKey(val)){
        map.put(val,map.get(val)+1);
      } else {
        map.put(val,1);
      }
    }
    for(Integer key : map.keySet()){
      if(map.get(key)>nums.length/2)
        return key;
    }
    return -1;
  }
}
time complexity:O(n)
space complexity:O(n)

sort find:
public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
time complexity:O(nlogn)
space complexity:O(1)

public class Solution {
  public static int majorityElement(int[] nums) {
    int count = 1;
    int major = nums[0];
    for(int i = 1; i < nums.length; i++){
        if(major == nums[i]){
            ++count;
        } else
            --count;
        if(count == 0){
            ++count;
            major = nums[i];
        }
    }
    return major;
  }
}
time complexity:O(n)
space complexity:O(1)