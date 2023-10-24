import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buf.readLine());
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 1; i <= N; i++){
            q.add(i);
        }
        
        while(q.size() > 1){
            q.poll();
            int front = q.poll();
            q.add(front);
        }
        System.out.println(q.poll());
    }
}

//1. 빼고
//2. 빼고 뒤로 넣기
//반복했을 때 최종적으로 남는 수