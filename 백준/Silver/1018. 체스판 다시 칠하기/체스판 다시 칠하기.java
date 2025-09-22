import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); //열
        int y = sc.nextInt(); //행

        sc.nextLine();

        char[][] chessBoard = new char[x][y];

        for (int i = 0; i < x; i++) {
            String line = sc.next();
            for (int j = 0; j < y; j++) {
                chessBoard[i][j] = line.charAt(j);
            }
        }


        int min = 64;


        for (int i = 0; i <= x - 8; i++) {
            for (int j = 0; j <= y - 8; j++) {
                int whiteFirst = 0; // (i,j)가 흰색일 때 칠해야 하는 수
                int blackFirst = 0; // (i,j)가 검은색일 때 칠해야 하는 수

                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        char current = chessBoard[i + k][j + l];

                        // (k+l) 짝수 → 시작색과 같아야 함
                        if ((k + l) % 2 == 0) {
                            if (current != 'W') whiteFirst++;
                            if (current != 'B') blackFirst++;
                        } else { // 홀수 → 시작색과 반대여야 함
                            if (current != 'B') whiteFirst++;
                            if (current != 'W') blackFirst++;
                        }
                    }
                }
                min = Math.min(min, Math.min(whiteFirst, blackFirst));
            }
        }

        System.out.println(min);
    }
}
