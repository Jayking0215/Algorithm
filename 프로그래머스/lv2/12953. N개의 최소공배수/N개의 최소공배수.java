class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
    
    //최소공배수 구하기
    public int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
    
    //최대공약수 구하기(유클리드 호재법)
    //(a > b)일때 a를 b로 나누고 a = b, b = 나머지, 나머지가 0이 될때까지 반복
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}
//a * b = 최대공약수(GCD) * 최소공배수(LCM)