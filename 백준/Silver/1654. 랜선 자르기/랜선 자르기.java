import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] LAN = new int[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            LAN[i] = Integer.parseInt(br.readLine());
            if (LAN[i] > max) {
                max = LAN[i];
            }
        }

        long start = 1;
        long end = max;
        long result = 0;

        while (start <= end) {
            long mid = (start + end) / 2;
            long lines = 0;

            for (int length : LAN) {
                lines += (length / mid);
            }

            if (lines >= N) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(result);
    }
}
