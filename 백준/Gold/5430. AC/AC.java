import java.util.*;
import java.io.*;
/*
5430번 : AC(골드5)
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int j=0; j<t; j++){
            char[] pChars = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());

            Deque<Integer> deque = new ArrayDeque<>();
            //입력받아 큐에 집어넣음

            String input = br.readLine();
            //대괄호제거
            String checked = input.substring(1, input.length()-1); //
            String[] checkedChars = checked.split(",");
            for(int i=0; i<n; i++){
                int marker = Integer.parseInt(checkedChars[i]);
                deque.add(marker);
            }

            boolean isReversed = false; //이걸로 할거임
            boolean isError=false;
            //순서대로 함수를 실행시킴
            for(char c : pChars){
                if(c == 'R'){
                    isReversed = !isReversed; //반대로들어간뒤
                }if(c == 'D'){
                    if(deque.isEmpty()){
                        sb.append("error");
                        isError = true;
                        break;
                    }else{
                        if(isReversed){
                            deque.pollLast();
                        }else{
                            deque.pollFirst();
                        }
                    }
                }
            }

            if(!isError){
                sb.append("[");
                if(isReversed){
                    while(!deque.isEmpty()){
                        sb.append(deque.pollLast());
                        if(!deque.isEmpty()){
                            sb.append(",");
                        }
                    }
                }else{
                    while(!deque.isEmpty()){
                        sb.append(deque.pollFirst());
                        if(!deque.isEmpty()){
                            sb.append(",");
                        }
                    }
                }
                sb.append("]");
            }
            sb.append("\n");
        }

        System.out.println(sb);


    }
}
