import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                sum += num;
            }
            int avg = (int)Math.round(sum / 10.0);
            System.out.println("#" + test_case + " " + avg);
        }
    }
}