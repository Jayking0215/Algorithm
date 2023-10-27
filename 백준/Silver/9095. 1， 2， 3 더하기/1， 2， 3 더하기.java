import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        while(N-- > 0){
            int n = sc.nextInt();
            int[] dp = new int[n + 1];
            dp[0] = 1;
            
            for(int i = 1; i <= n; i++){
                if(i - 1 >= 0) dp[i] += dp[i - 1];
                if(i - 2 >= 0) dp[i] += dp[i - 2];
                if(i - 3 >= 0) dp[i] += dp[i - 3];
            }
            
            System.out.println(dp[n]);
        }
    }
}