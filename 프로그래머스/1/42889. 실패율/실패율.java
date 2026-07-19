import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int n = stages.length;

        int[] arr1 = new int[N];   // 도달한 사람 수
        int[] arr2 = new int[N];   // 실패한 사람 수
        double[] arr3 = new double[N];

        for (int i = 0; i < n; i++) {
            int number = stages[i];

         
            if (number != N + 1) {
                arr2[number - 1]++;
            }

            
            if (number == N + 1) {
              
                for (int j = 0; j < N; j++) {
                    arr1[j]++;
                }
            } else {
                
                for (int j = 0; j < number; j++) {
                    arr1[j]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if (arr1[i] == 0)
                arr3[i] = 0;
            else
                arr3[i] = (double) arr2[i] / arr1[i];   
        }

        Map<Integer, Double> map = new HashMap<>();
        
        for(int i=0; i<N; i++){
            map.put(i+1, arr3[i]); 
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        
       list.sort((a, b) -> Double.compare(map.get(b), map.get(a)));
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}