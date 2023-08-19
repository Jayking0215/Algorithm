class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++){
            int tmp = 0;
            
            for(int j = 1; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    tmp++;
                    if(j != i / j){
                        tmp++;
                    }
                }
                if(tmp > limit){
                    tmp = power;
                    break;
                }
            }
            
            answer += tmp;
        }
        
        return answer;
    }
}