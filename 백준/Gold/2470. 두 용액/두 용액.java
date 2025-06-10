import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        int ans1 = 0;
        int ans2 = 0;

        int left = 0;
        int right = N-1;

        while(left < right) {
            int sum = arr[left] + arr[right];

            if(Math.abs(sum) < min) {
                min = Math.abs(sum);
                ans1 = arr[left];
                ans2 = arr[right];
            }

            if(sum < 0) {
                left++; // 음수면 왼쪽 증가
            }
            else {
                right--; // 양수면 오른쪽 증가
            }
        }

        System.out.println(ans1 + " " + ans2);
    }
}