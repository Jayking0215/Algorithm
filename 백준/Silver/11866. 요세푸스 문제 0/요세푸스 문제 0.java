import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]); // 사람 수
        int k = Integer.parseInt(str[1]); // 요세푸스 k
        Queue<Integer> queue = new LinkedList<>();
        
        // 원에 사람 추가
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                // K-1번째까지의 사람을 다시 원에 넣기
                int front = queue.poll();
                queue.offer(front);
            }

            // K번째 사람을 제거하고 결과에 추가
            int removed = queue.poll();
            sb.append(removed);

            // 원에 남은 사람이 있다면 콤마 추가
            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }

        sb.append(">");
        System.out.println(sb.toString());
    }
}
