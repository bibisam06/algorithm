import java.util.*;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //문자열 당 갯수 비교하기

    int n = sc.nextInt();
    int k = sc.nextInt(); //부분 문자열의 길이 - window
    sc.nextLine();
    String str = sc.nextLine();

    int[] need = new int[4]; //필요한 거 저장하는 용도
    int[] count = new int[4]; //map 대신 배열로 저장하기
    int ans = 0;

    for(int i=0; i<4; i++) {
        need[i] = sc.nextInt();
    }

    boolean isOk = true;

    for(int i=0; i<k; i++){
        count[index(str.charAt(i))] ++;
    }

    for(int i=0; i<4; i++){
        if(count[i] < need[i]) {
            isOk = false;
            break;
        }
    }

    if(isOk){
        ans++;
    }


    for(int i=k; i<n; i++){
        count[index(str.charAt(i-k))] --; //
        count[index(str.charAt(i))] ++;

        isOk = true;

        for(int j=0; j<4; j++){
            if (count[j] < need[j]) {
                isOk = false;
                break;
            }
        }

        if(isOk){
            ans++;
        }
    }

    System.out.println(ans);

}

static int index(Character ch){
    return switch (ch) {
        case 'A' -> 0;
        case 'C' -> 1;
        case 'G' -> 2;
        default -> 3; // 'T'
    };
}
}
