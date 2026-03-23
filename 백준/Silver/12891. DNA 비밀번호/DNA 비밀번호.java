import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int p = sc.nextInt();

        String input = sc.next();

        int[] need = new int[4];
        int[] has = new int[4];

        for(int i=0; i<4; i++){
            need[i] = sc.nextInt();
        }

        char[] dna = input.toCharArray();

        // 첫 P개 계산
        for(int i=0; i<p; i++){
            switch(dna[i]){
                case 'A':
                    has[0]++;
                    break;
                case 'C':
                    has[1]++;
                    break;
                case 'G':
                    has[2]++;
                    break;
                case 'T':
                    has[3]++;
                    break;
            }
        }

        int count = 0;

        // 첫 윈도우 검사
        if(check(has, need)) count++;

        // 슬라이딩
        for(int i=p; i<s; i++){
            char add = dna[i];
            char remove = dna[i-p];

            // 들어오는 문자 추가
            switch(add){
                case 'A':
                    has[0]++;
                    break;
                case 'C':
                    has[1]++;
                    break;
                case 'G':
                    has[2]++;
                    break;
                case 'T':
                    has[3]++;
                    break;
            }

            // 빠지는 문자 제거
            switch(remove){
                case 'A':
                    has[0]--;
                    break;
                case 'C':
                    has[1]--;
                    break;
                case 'G':
                    has[2]--;
                    break;
                case 'T':
                    has[3]--;
                    break;
            }

            if(check(has, need)) count++;
        }

        System.out.println(count);
    }

    public static boolean check(int[] has, int[] need){
        for(int i=0; i<4; i++){
            if(has[i] < need[i]) return false;
        }
        return true;
    }
}