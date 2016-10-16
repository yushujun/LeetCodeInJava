public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        quickSort(nums,0,nums.length-1,k);
        for(int i = 0; i < k; i++)
            ans.add(nums[i]);
        return ans;
    }
    public void quickSort(int[] nums,int start,int end,int k){
        if(start >= end) return ;
        int pivot = nums[start];
        int i = start,j = end;
        while(i < j){
            while(i < j && pivot <= nums[j]) j--;
            while(i < j && pivot >= nums[i]) i++;
            if(i < j){
                nums[i] ^= nums[j];
                nums[j] ^= nums[i];
                nums[i] ^= nums[j];
            }
        }
        if(i == k) return ;
        else if(i > k) quickSort(nums,start,i-1,k);
        else quickSort(nums,i+1,end,k);
    }
}
time complexity:O(n)
space complexity:O(1)
快排会让递归栈深度很深，会让系统栈爆掉，如果用人工栈模拟系统栈会不会ac呢？

// use hash table
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null) {
                bucket[freq] = new LinkedList<>();
            }
            bucket[freq].add(key);   
        }
        List<Integer> res = new ArrayList<>();
        for(int i = bucket.length-1; i >= 0 && res.size() < k; i--){
            if(bucket[i] != null){
                for(int j = 0; j < bucket[i].size() && res.size() < k; j++)
                    res.add(bucket[i].get(j));
            }
        }
        return res;
    }
}
time complexity:O(n)
space complexity:O(n)

// use maxHeap
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
            map.put(n,map.getOrDefault(n,0)+1);
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>((a,b)->(b.getValue()-a.getValue()));
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
            maxHeap.add(entry);
        List<Integer> res = new ArrayList<>();
        while(res.size() < k)
            res.add(maxHeap.poll().getKey());
        return res;
    }
}
time complexity:O(n)
space complexity:O(n)

// use treeMap
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums)
            map.put(n,map.getOrDefault(n,0)+1);
        TreeMap<Integer,List<Integer>> freqMap = new TreeMap<>();
        for(int num : map.keySet()){
            int freq = map.get(num);
            if(!freqMap.containsKey(freq))
                freqMap.put(freq,new LinkedList<>());
            freqMap.get(freq).add(num);
        }
        List<Integer> res = new ArrayList<>();
        while(res.size() < k){
            Map.Entry<Integer,List<Integer>> entry = freqMap.pollLastEntry();
            List<Integer> list = entry.getValue();
            for(int j = 0; j < list.size() && res.size() < k; j++)
                res.add(list.get(j));
        }
        return res;
    }
}
time complexity:O(n)
space complexity:O(n)