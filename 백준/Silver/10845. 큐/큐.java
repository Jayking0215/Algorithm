import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push":
                    int X = Integer.parseInt(command[1]);
                    queue.add(X);
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        System.out.println(queue.poll());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    if (!queue.isEmpty()) {
                        System.out.println(queue.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        int size = queue.size();
                        int back = 0;
                        for (int num : queue) {
                            if (--size == 0) {
                                back = num;
                                break;
                            }
                        }
                        System.out.println(back);
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}
