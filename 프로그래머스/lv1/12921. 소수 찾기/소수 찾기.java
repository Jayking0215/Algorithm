class Solution {
    public int solution(int n) { 
        int answer = 0; 
        boolean[] prime = new boolean[n + 1]; 
        
        for(int i = 2; i <= n ; i++){//모든 수를 소수로 가정
            prime[i] = true;
        }
      
        for(int i = 2; i * i <= n; i++){
            if (prime[i]) {
                for(int j = i * i; j <= n; j += i){//소수의 제곱은 소수가 아님
                    prime[j] = false;
                }
            }
        }
      
        for(int i = 2; i <= n; i++){ 
            if(prime[i] == true){
                answer++; 
            }
        } 
      
        return answer; 
    }
}
