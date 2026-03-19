import java.util.*; 

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int n = s.length(); 
        //첨엔 함수로뺄랬는데 어떻게 넘기기가 애매해져서 
        //걍 함수뺴지 말고여기서 처리 하기로 정함 
        char[] chars = s.toCharArray(); 
        for(int i=0; i<n; i++){ //n-1번 회전 
            char tmp = chars[0] ; // 일단 첫번째거 저장해놔 
            //그다음 계속 옮겨 
            for(int j=1; j<n; j++){
                chars[j-1] = chars[j]; // j-> j-1로 해버리고 
            }
            //마지막거 첫번쨰거 넣으셈
            chars[n-1] = tmp; 
            
           if(checkIfTrue(chars)) {
              answer ++; 
           }
        }
        
        
        
        return answer;
    }
    
static boolean checkIfTrue(char[] chars){ //체크로직
    boolean isValid = true; 
    Deque<Character> stack = new ArrayDeque<>(); // 스택선언
    
    for(char c : chars){
        if(c =='(' || c =='[' || c=='{'){
            //여는 괄호일때  
            stack.push(c); 
        }else if(c == ')'){
            if(!stack.isEmpty() && stack.peek()=='('){
                stack.pop(); 
            }else{
                isValid=false;
                break;
            }
        }else if(c == ']'){
            if(!stack.isEmpty() && stack.peek()=='['){
                stack.pop(); 
            }else{
                isValid=false;
                break;
            }
        }else if(c == '}'){
            if(!stack.isEmpty() && stack.peek()=='{'){
                stack.pop(); 
            }else{
                isValid=false;
                break;
            }
        }
    }

    
    return isValid && stack.isEmpty();
}
}
    
