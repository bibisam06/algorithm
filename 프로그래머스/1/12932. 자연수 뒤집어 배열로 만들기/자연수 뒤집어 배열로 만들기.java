import java.util.*;
class Solution {
    public int[] solution(long n) {
        List<Integer> list = new ArrayList<Integer>();
        while(n!=0){
            int a = (int)(n%10);
            System.out.println("a들어간다~ : "+ a);
            list.add(a);
            n/=10; 
        }
        
    
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}