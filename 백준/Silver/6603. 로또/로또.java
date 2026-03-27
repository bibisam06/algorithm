
import java.util.*;
import java.io.*;
/*
6603번 : 로또 ( 실버 2 )
 */
public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String line = br.readLine();
            if(line.equals("0")){
                break;
            }

            StringTokenizer stk = new StringTokenizer(line);

            int k = Integer.parseInt(stk.nextToken());
            int[] nums  = new int[k];
            List<Integer> curr = new ArrayList<>();

            for(int i=0; i<k; i++){
                nums[i] = Integer.parseInt(stk.nextToken());
            }

            dfs(0, curr, nums, 6);
            sb.append("\n");
        }

        System.out.print(sb);
    }

    static void dfs(int index, List<Integer> curr, int[] nums, int r){
        if(curr.size() == r){
            //다골랐을때,
            for(int value : curr){
                sb.append(value).append(" ");
            }
            sb.append("\n");
            return;
        }

        if(index == nums.length){
            //끝까지 다 본 경우
            return;
        }

        //해당 원소를 고르는 경우
        curr.add(nums[index]);
        dfs(index+1, curr, nums, r);
        //백트래킹
        curr.remove(curr.size()-1);
        //해당원소를 고르지 않는 경우
        dfs(index+1, curr, nums, r);


    }
}
