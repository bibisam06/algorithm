import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        boolean flag = true; 
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();
        Set<Character> setS = new HashSet<>();
        Set<Character> setT = new HashSet<>();
        

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        int n1 = charS.length; 
        int n2 = charT.length; 
        
        if(n1 != n2) return false; 

        for(int i=0; i<charS.length; i++){
            mapS.put(charS[i], mapS.getOrDefault(charS[i], 0) + 1);
            setS.add(charS[i]);
        }

        for(int i=0; i<charT.length; i++){
            mapT.put(charT[i], mapT.getOrDefault(charT[i], 0) + 1); 
            setT.add(charT[i]);
        }

        for(Character c : setT){
            int target = mapT.get(c);
            if(!setS.contains(c)){
                flag = false; 
                break;
            }

            int string = mapS.get(c);
            if(string!=target){
                flag= false;
                break;
            }
        }

        return flag;
    }
}