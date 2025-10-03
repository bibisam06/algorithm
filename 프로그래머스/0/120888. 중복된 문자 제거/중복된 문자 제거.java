import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(); 
        
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>(); 
        
        for(int i=0; i<my_string.length(); i++){
            String value = String.valueOf(my_string.charAt(i)); 
            if(!set.contains(value)){
                set.add(value);
                list.add(value);
            }
        }
        
        for(String s : list){
            sb.append(s);
        }
        
        return sb.toString();
    }
}