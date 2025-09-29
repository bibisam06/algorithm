import java.util.*; 

class Solution{
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        // 이거 어캐씀?  
        List<String> list = new ArrayList<>(); 
       
        Queue<String> queue = new ArrayDeque<>(); 
        Set<String> visited = new HashSet<>(); 
		Map<String, Integer> dist = new HashMap<>(); 
      
        for(int i=0; i<words.length; i++){
            list.add(words[i]); 
        }
        
        if(!list.contains(target)){
            return 0; 
        }
        
        queue.add(begin);
       	visited.add(begin); 
        dist.put(begin, 0); 
            
        while(!queue.isEmpty()){
            String current = queue.poll();
            
            if(current.equals(target)){
                return dist.get(current); 
            }
            // 하나 꺼내서 비교함 
            for(int i=0; i<words.length; i++){
                if(!visited.contains(words[i]) && getCount(current, words[i]) == 1)
                {
                    visited.add(words[i]); 
                    queue.add(words[i]); 
                    dist.put(words[i], dist.get(current) + 1);  
                    
                }
            }
        }
      	
        System.out.println(dist); 
        answer = dist.get(target); 
        return answer;
    }
    
    public static int getCount(String first, String second){
        
        int count = 0; 
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray(); 
        
        for(int i=0; i<first.length(); i++){
            if(firstChars[i] != secondChars[i]){
                count++; 
            }
        }
        
        return count; 
    }
}