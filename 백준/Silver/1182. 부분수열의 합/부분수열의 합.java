import java.util.*;
public class Main {

    static int counter = 0;
    static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        bfs(nums, 0, sum, s);
        if(s == 0) counter--; //아예안고른것도잡히기때무넹

        System.out.println(counter);
    }

    public static void bfs(int[] arr, int index, int sum, int s){
        int N = arr.length;
        if (index == N) {
            if(sum == s){
                counter ++;
            }
            return;
        }

        bfs(arr, index+1, sum + arr[index], s);
        bfs(arr, index+1, sum, s);
    }
}
