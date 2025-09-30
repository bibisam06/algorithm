import java.util.*; 

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        int n = board.length; 
        Deque<Integer> stack = new ArrayDeque<>(); 
 
        for(int i=0; i<moves.length; i++){
            int newValue = 0;
            int index = moves[i]-1; 

            for(int j=0; j<board.length; j++){

                if (board[j][index] != 0) {          // ← board[row][col]
                    newValue = board[j][index];      // 값만 꺼내고 
                    board[j][index] = 0;             // 집었으니 비우기
                    break;
                }

            }


            while(!stack.isEmpty()){
                if(stack.peek() == newValue){
                    stack.pop(); 
                    answer = answer + 2; 
                    newValue = 0; 
                    break; 
                }
                else{ 
                break;
                }
            }
            
            if(newValue!=0){
                stack.push(newValue); 
            }
        }
        return answer;
    }


}