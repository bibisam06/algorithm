import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();

        if(chars1.length != chars2.length) return false;

        for(int i=0; i<chars1.length; i++){
            map1.put(chars1[i], map1.getOrDefault(chars1[i], 0) + 1);
        }

        for(int i=0; i<chars2.length; i++){
            map2.put(chars2[i], map2.getOrDefault(chars2[i], 0) + 1); 
        }

        for(Character key : map2.keySet()){ 
            //keySet -> Set 
            Set<Character> set1 = map1.keySet();
            if(!set1.contains(key)) return false;

            int first = map1.get(key);
            int second = map2.get(key);

            if(first!=second) return false;
            
        }
        return true;
    }
}