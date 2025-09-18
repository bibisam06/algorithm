import java.math.BigInteger;
import java.util.Scanner;

/*
15740번 문제 : A + B - 9 (백준)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        
        sc.nextLine(); // 버퍼 비우는 용도임
        BigInteger C = A.add(B);
        
        System.out.println(C.toString());


    }
}