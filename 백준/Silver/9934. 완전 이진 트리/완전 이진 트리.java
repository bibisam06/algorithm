import java.util.*;

public class Main {

    static int[] numbers;
    static List<Integer>[] tree;
    static int K;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        K = N;
        int total = (int)(Math.pow(2, N) -1);
        tree = new ArrayList[total];
        numbers = new int[total];

        for(int i=0; i<total; i++) {
            numbers[i] = sc.nextInt();
            tree[i] = new ArrayList<>();
        }

        search(1, 0, total-1);

        for(int i=1; i<=K; i++) {
            for(int j=0; j<tree[i].size(); j++) {
                if(j == tree[i].size() -1) {
                    System.out.print(tree[i].get(j));
                }else {
                    System.out.print(tree[i].get(j) + " ");
                }
            }
            System.out.println();
        }
    }

    static void search(int depth, int left, int right){

        if(depth > K || left > right) {
            return;
        }
        int mid = (left + right) / 2;
        tree[depth].add(numbers[mid]);

        search(depth+1, left, mid-1);
        search(depth+1, mid+1, right);

    }
}
