import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int n = plays.length;
        
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, List<int[]>> map2 = new HashMap<>();
        
        for(int i=0; i<n; i++){
            map1.put(genres[i], map1.getOrDefault(genres[i], 0) + plays[i]);
            if(!map2.containsKey(genres[i])) map2.put(genres[i], new ArrayList<>()); 
            map2.get(genres[i]).add(new int[]{i, plays[i]}); 
        } //map에 다 집어넣었음 
        //장르별 총 재생수 대로 정렬하기 -> 
        List<String> genreList = new ArrayList<>(map1.keySet());
        genreList.sort((a, b) -> map1.get(b) - map1.get(a));
        List<Integer> answerList = new ArrayList<>();
        //장르안에서 재생수대로 정렬하기 
        for(int i=0; i<genreList.size(); i++){
            List<int[]> list = map2.get(genreList.get(i));
            list.sort((a, b) -> {
            if (a[1] == b[1]) {
            return a[0] - b[0];
        }   
            return b[1] - a[1];
        });
            
            for (int j = 0; j < Math.min(2, list.size()); j++) {
    answerList.add(list.get(j)[0]);
}
        }
        
        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}