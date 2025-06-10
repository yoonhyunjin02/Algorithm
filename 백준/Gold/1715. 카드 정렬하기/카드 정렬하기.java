import java.io.*;
import java.util.*;

public class Main {
    // 이진 탐색으로 삽입 위치 찾는 메서드
    public static int findInsertIndex(List<Integer> list, int value) {
        int left = 0;
        int right = list.size();

        while (left < right) {
            int mid = (left + right) / 2;
            if (list.get(mid) < value) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> cards = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            cards.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(cards);  // 작은 것부터 정렬

        int total = 0;

        while (cards.size() > 1) {
            // 가장 작은 두 개를 꺼내서 합치기
            int a = cards.remove(0);
            int b = cards.remove(0);
            int sum = a + b;
            
            // 비교 횟수 더하기
            total += sum;

            // 합친 결과를 이진 탐색으로 알맞은 위치에 삽입
            int insertIndex = findInsertIndex(cards, sum);
            cards.add(insertIndex, sum);
        }

        System.out.println(total);
    }
}