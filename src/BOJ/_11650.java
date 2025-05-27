package BOJ;

import java.util.*;

public class _11650 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] points = new int[N][2];

        for (int i = 0; i < N; i++) {
            points[i][0] = sc.nextInt();  // x
            points[i][1] = sc.nextInt();  // y
        }

        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        for (int[] point : points) {
            System.out.println(point[0] + " " + point[1]);
        }

        sc.close();

    }
}