import java.io.*;
import java.util.*;

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
                    System.out.println(queue.isEmpty() ? -1 : queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;
                case "front":
                    System.out.println(queue.isEmpty() ? -1 : queue.peek());
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
