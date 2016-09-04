public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        generateStr(root,list,"");
        return list;
    }
    public void generateStr(TreeNode root,List<String> list,String path){
        if(root == null) return ;
        if(root.left == null && root.right == null) {
            list.add(path+root.val);
        }   
            generateStr(root.left,list,path+root.val+"->");
            generateStr(root.right,list,path+root.val+"->");   
    }
}
time complexity:O(n)
space complexity:O(1)