import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        Queue<Integer> q = new LinkedList<>();
        
        StringBuilder sb = new StringBuilder();
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]); // 사람 수
        int k = Integer.parseInt(str[1]); // 요세푸스 k
        
        sb.append("<");
        
        for(int i = 1; i <= n; i++){
            q.offer(i);//Q 원형에 사람 배치
        }
        
        while(!q.isEmpty()){
            for(int i = 1; i < k; i++){
                q.offer(q.poll());//k번째 이전 사람 뒤로 보내기
            }
            sb.append(q.poll());//k번째 사람 br에 추가

            if (!q.isEmpty()) {//앞사람 있으면 ,추가
                sb.append(", ");
            }
        }
        
        sb.append(">");
        System.out.println(sb.toString());
    }
}