class Solution {
    public int solution(int n){
        int answer = 0;

        for(int i = 1; i <= n; i++){
            int sum = 0;
            for(int j = i; j <= n; j++){
                sum += j;
                if(sum == n){
                    answer++;
                    break;
                }else if(sum > n){
                    break;
                }
            }
        }

        return answer;
    }
}

//자연수를 연속된 자연수의 합으로 표현하는 방법의 홀수 약수의 개수와 같다
//public int expressions(int num) {
//   int answer = 0;
//   for (int i = 1; i <= num; i += 2) 
//       if (num % i == 0) 
//           answer++;
//
//   return answer;
//}