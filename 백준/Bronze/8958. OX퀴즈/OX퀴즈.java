import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < N; i++){

            char[] chars = sc.nextLine().toCharArray();
            int counter = 0;
            int sum = 0;
            for(char c : chars){
                if(c == 'X'){
                    counter = 0;
                }else if(c=='O'){
                    counter++;
                    sum += counter;
                }
            }

            System.out.println(sum);
        }
    }
}
