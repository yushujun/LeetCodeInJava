public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] strArr1 = version1.split("\\.");
        String[] strArr2 = version2.split("\\.");
        int i;
        for(i = 0; i < strArr1.length && i < strArr2.length; i++){
            int i1 = Integer.parseInt(strArr1[i]);
            int i2= Integer.parseInt(strArr2[i]);
            if(i1 > i2) return  1;
            else if(i1 < i2) return -1;
        }
        if(strArr1.length > strArr2.length){
            while(i < strArr1.length){
                int temp = Integer.parseInt(strArr1[i]);
                if(temp != 0) return 1;
                i++;
            }
        } else if(strArr1.length < strArr2.length){
             while(i < strArr2.length){
                int temp = Integer.parseInt(strArr2[i]);
                if(temp != 0) return -1;
                i++;
            }
        }
        return 0;
    }
}
time complexity:O(n)
space complexity:O(1)

public class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0,j = 0,len1 = version1.length(),len2 = version2.length();
        char[] c1 = version1.toCharArray();
        char[] c2 = version2.toCharArray();
        while(i < len1 || j < len2){
            int cur1 = 0,cur2 = 0;
            while(i < len1 && c1[i] != '.') cur1 = cur1*10+c1[i++]-'0';
            while(j < len2 && c2[j] != '.') cur2 = cur2*10+c2[j++]-'0';
            if(cur1 > cur2) return 1;
            else if(cur1 < cur2) return -1;
            i++;j++;
        }
        return 0;
    }
}
time complexity:O(n)
space complexity:O(1)