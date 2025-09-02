import java.util.*;
class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        //int[] answer = {};
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> answerList = new ArrayList<Integer>();
        for(int i=0; i<commands.length; i++){
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            
        int[] subArr = Arrays.copyOfRange(array, a-1, b);
        List<Integer> subList = new ArrayList<>();
        for (int num : subArr) subList.add(num);
            Collections.sort(subList);
            System.out.println(c+"번쨰 꺼 .. " + subList.get(c-1));
            
            answerList.add(subList.get(c-1));
            
        }
        
        
        return answerList; 
    }
}