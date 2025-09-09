import java.util.*; 
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Set<String> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<words.length; i++){
            
            int number = i % (n) + 1;
            System.out.println("i번쨰 " + i + "숫자는?" + number);
            map.put(number, map.getOrDefault(number, 0) + 1);
            if(set.contains(words[i])){ // 이미 있는 단어 말 했을 때, 
                answer[0] = number; 
                answer[1] = map.get(number);
                break;
            } // 그냥 끝말있기 틀렸을 때, 

            
            if(set.contains(words[i]) || (i > 0 && 
            !words[i-1].substring(words[i-1].length()-1).equals(words[i].substring(0,1)))) {
                answer[0] = number;
                answer[1] = map.get(number);
                break;
            }   
            
            set.add(words[i]); 
        }

        return answer;
    }
}