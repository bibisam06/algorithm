import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
       
        int[] char1 = {1,2,3,4,5};
        int[] char2 = {2,1,2,3,2,4,2,5};
        int[] char3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] scores = {0,0,0};
        for(int i=0; i<answers.length; i++){
            if(answers[i] == char1[i%5]) scores[0]++;
            if(answers[i] == char2[i%8]) scores[1]++;
            if(answers[i] == char3[i%10]) scores[2]++;
        }
        
        
    
         // 최대 점수 구하기
        int max = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        // 최대 점수를 가진 수포자 리스트 생성
        List<Integer> answ = new ArrayList<Integer>();
        for(int i=0; i<scores.length; i++) if(max == scores[i]) answ.add(i+1);
        
        int[] answer = new int[answ.size()];
        for(int i=0; i<answ.size(); i++){
            answer[i] = answ.get(i);
        }

        return answer;
        
    }
    

       
}