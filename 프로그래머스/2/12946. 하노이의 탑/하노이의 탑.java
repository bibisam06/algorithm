import java.util.*;

class Solution {
    public int[][] solution(int n) {
        List<int[]> tmpList = hanoi(n, 1, 3, 2);
        int[][] answer = new int[tmpList.size()][2];
        
        for (int i = 0; i < tmpList.size(); i++) {
            answer[i] = tmpList.get(i);
        }
        
        return answer;
    }
    
    List<int[]> hanoi(int n, int start, int end, int tmp) {
        List<int[]> list = new ArrayList<>();
        
        if (n == 1) { 
            list.add(new int[]{start, end});
        } else {
            list.addAll(hanoi(n - 1, start, tmp, end));
            list.add(new int[]{start, end});
            list.addAll(hanoi(n - 1, tmp, end, start));
        }
        
        return list;
    }
}
