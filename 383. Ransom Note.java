public class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    Map<Character,Integer> map = new HashMap<>();
    for(int i = 0; i < magazine.length();++i){
      if(!map.containsKey(magazine.charAt(i))){
        map.put(magazine.charAt(i),1);
      } else {
        map.put(magazine.charAt(i),map.get(magazine.charAt(i))+1);
      }
    }
    for(int j = 0;j < ransomNote.length();j++){
      if(map.containsKey(ransomNote.charAt(j))&&(map.get(ransomNote.charAt(j))>0)){
        map.put(ransomNote.charAt(j),map.get(ransomNote.charAt(j))-1);
        continue;
      } else {
        return false;
      }
    }
    return true;
  }
}

time complexity:O(m+n)
space complexity:O(m) m is length of magazine,n is length of ransomNote