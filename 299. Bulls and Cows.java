HashMap:
public class Solution {
    public String getHint(String secret, String guess) {
        if(secret == null || guess == null || secret.length() == 0 || guess.length() == 0)
        return "0A0B";
        Map<Character,Integer> secretMap = new HashMap<>();
        Map<Character,Integer> guessMap = new HashMap<>();
        int bull = 0, cow = 0;
        for(int i = 0;i < secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i)) bull++;
            else {
                if(!secretMap.containsKey(secret.charAt(i))) 
                    secretMap.put(secret.charAt(i),1);
                else secretMap.put(secret.charAt(i),secretMap.get(secret.charAt(i))+1);
                if(!guessMap.containsKey(guess.charAt(i))) 
                    guessMap.put(guess.charAt(i),1);
                else guessMap.put(guess.charAt(i),guessMap.get(guess.charAt(i))+1);
            }
        }
        for(Character c : secretMap.keySet()){
            while(secretMap.get(c)>0 && guessMap.containsKey(c) && guessMap.get(c)>0){
                secretMap.put(c,secretMap.get(c)-1);
                guessMap.put(c,guessMap.get(c)-1);
                cow++;
            }
        }
        return bull+"A"+cow+"B";
    }
}
time complexity:O(n)
space complexity:O(n)

array:
public class Solution {
    public String getHint(String secret, String guess) {
        int s,g,bull,cow;
        s = g = bull = cow = 0;
        int[] book = new int[10];
        for(int i = 0;i < secret.length();i++){
            s = secret.charAt(i)-'0';
            g = guess.charAt(i)-'0';
            if(s == g)
                bull++;
            else {
                if(book[s]<0) cow++;
                book[s]++;
                if(book[g]>0) cow++;
                book[g]--;
            }
        }
        return bull+"A"+cow+"B";
    }
}
time complexity:O(n)
space complexity:O(n)