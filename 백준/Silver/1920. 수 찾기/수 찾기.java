import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(buf.readLine());//숫자 개수
        String[] input = buf.readLine().split(" ");//판별 숫자 5개 배열로 저장
        
        HashSet<Integer> set = new HashSet<>();//중복 허용x
        
        for(int i = 0; i < N; i++){
            set.add(Integer.parseInt(input[i]));//set에 판별 숫자 5개 저장
        }
        
        int M = Integer.parseInt(buf.readLine());//검수 할 숫자 갯수
        String[] check = buf.readLine().split(" ");//검수 할 숫자 5개 배열에 저장
        
        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(check[i]);
            if(set.contains(num)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}