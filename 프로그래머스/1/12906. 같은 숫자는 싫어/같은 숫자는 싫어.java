import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
       ArrayList<Integer> list = new ArrayList<>();
        int prev = -1;

        for (int a : arr) {
            if (a != prev) {
                list.add(a);
            }
            prev = a;
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}