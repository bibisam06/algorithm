import java.io.*;
/*
9935 : 문자열 폭발(골드IV)
 */
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        String target = br.readLine();
        int targetLength = target.length();

        char[] chars = input.toCharArray();
        for(int i=0; i<input.length(); i++){
            char c = chars[i];
            sb.append(c);
            if(sb.length() >= targetLength) {
                //검사로직
                String sub = sb.substring(sb.length()-targetLength);
                if(sub.equals(target)) sb.delete(sb.length()-targetLength, sb.length());
            }
        }


        //결론
        if(sb.length()==0){
            System.out.println("FRULA");
        }else{
            System.out.println(sb);
        }
    }
}
