package BOJ;

import java.util.*;

public class _1018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        boolean[][] board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j) == 'W';
            }
        }

        int min = 64;

        for (int x = 0; x <= N - 8; x++) {
            for (int y = 0; y <= M - 8; y++) {
                int count1 = 0;
                int count2 = 0;

                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                        boolean current = board[x + i][y + j];
                        boolean expected = ((i + j) % 2 == 0);

                        if (current != expected) count1++;
                        if (current == expected) count2++;
                    }
                }

                min = Math.min(min, Math.min(count1, count2));
            }
        }
        System.out.println(min);

        sc.close();
    }
}