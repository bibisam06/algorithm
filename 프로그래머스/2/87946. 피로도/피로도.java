import java.util.*; 

class Solution {
    static List<Integer> answerList = new ArrayList<>(); //정답 담을 배열 
    public int solution(int k, int[][] dungeons){
        int n = dungeons.length; 
        boolean[] visited = new boolean[n]; 
    
        backtracking(new ArrayList<>(), k, visited, dungeons);
        
        Collections.sort(answerList);
        int size = answerList.size() - 1; 
        int answer = answerList.get(size); 
        return answer;
    }
    
    private boolean canVisit(int need, int k) { 
    return k >= need; 
    }
    
    public void backtracking(List<Integer> ans, int k, boolean[] visited, int[][] dungeons){
        for(int i=0; i<dungeons.length; i++){
            int a = dungeons[i][0];
            int b = dungeons[i][1]; 
            
            if(!canVisit(a, k)){
                answerList.add(ans.size()); 
                //answer.clear();
              //  System.out.prin
            }
            if(!visited[i] && canVisit(a, k)){ // pruning
                visited[i] = true; 
                ans.add(a); 
                backtracking(ans, k-b, visited, dungeons);
                visited[i] = false; // backtracking
                ans.remove(ans.size() - 1);
            }
            
        }
        
    }
}