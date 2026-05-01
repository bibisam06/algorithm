import java.util.*; 

class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(String s : operations){
            if(s.equals("+")){
                int first = stack.removeLast();
                int second = stack.removeLast(); //일단 꺼내서 저장해두고 
                int added = first + second;
                stack.add(second);
                stack.add(first);
                stack.add(added);
            }else if(s.equals("D")){
                int top = stack.peekLast();
                int doubled = top * 2; 
                stack.add(doubled);
            }else if(s.equals("C")){
                stack.removeLast();
            }else{
                int nNum = Integer.parseInt(s); 
                stack.add(nNum); 
                //숫자의 경우 -> 그냥 집어넣기만 한다 
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum += stack.remove();
        }
        return sum; 
    }
}