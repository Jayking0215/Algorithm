class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // if(n <= 1){
        //     answer = n;
        // }else{//재귀함수 구현 : 중복계산으로 시간초과 발생
        //     answer = solution(n - 1) + solution(n - 2);
        // }
        
        int m1 = 0;
        int m2 = 1;
        
        for(int i = 2; i <= n; i++){
            answer = (m1 + m2) % 1234567;
            m1 = m2;
            m2 = answer;
        }
            
        return answer;
    }
}