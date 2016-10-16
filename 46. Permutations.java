sawp backtracking:
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        if(nums.length == 0) return ansList;
        permutation(nums,0,nums.length-1,ansList);
        return ansList;
    }
    public void permutation(int[] nums,int start,int end,List<List<Integer>> ansList){
        if(start == end){
            List<Integer> list = new ArrayList<>();
            for(int n : nums)
                list.add(n);
            ansList.add(list);
            return ;
        }
        for(int i = start; i <= end; i++){
            swap(nums,start,i);
            permutation(nums,start+1,end,ansList);
            swap(nums,start,i);
        }
    }
    public void swap(int[] nums,int i,int j){
        if(i != j){
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }
}
time complexity:O(n!)
space complexity:O(1)

backtracking:
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        int[] temp = new int[nums.length];
        boolean[] visit = new boolean[nums.length];
        dfs(nums,temp,0,visit,ansList);
        return ansList;
    }
    public void dfs(int[] nums,int[] temp,int step,boolean[] visit,List<List<Integer>> ansList){
        if(step == nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int n : temp)
                list.add(n);
            ansList.add(list);
            return ;
        }
        for(int i = 0; i < nums.length; i++){
            if(!visit[i]){
                visit[i] = true;
                temp[step] = nums[i];
                dfs(nums,temp,step+1,visit,ansList);
                visit[i] = false;
            }
        }
    }
}
time complexity:O(n!)
space complexity:O(n)

no-recursion:
public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        if(nums.length == 0) return ansList;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int n : nums)
            list.add(n);
        ansList.add(list);
        if(nums.length == 1) return ansList;
        while(true){
            int i,j;
            for(i = nums.length-2; i >= 0; i--)
                if(nums[i] < nums[i+1]) break;
                else if(i == 0) return ansList;
            for(j = nums.length-1; j > i; j--)
                if(nums[j] > nums[i]) break;
            swap(nums,i,j);
            reverse(nums,i+1,nums.length-1);
            list = new ArrayList<>();
            for(int n : nums)
                list.add(n);
            ansList.add(list);
        }
    }
    public static void reverse(int[] nums,int start,int end){
        while(start < end){
            swap(nums,start,end);
            start++;end--;
        }
    }
    public static void swap(int[] nums,int i,int j){
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }
}
time complexity:O(n!)
space complexity:O(1)