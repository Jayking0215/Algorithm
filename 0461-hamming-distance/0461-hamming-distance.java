class Solution {
    public int hammingDistance(int x, int y) {//hammingDistance = 두 비트가 다른 위치가 2곳 있음을 의미
    int answer = 0;
    int n = x ^ y;
        
    while(n != 0){
        if((n & 1) == 1){//가장 오른쪽 비트(최하위 비트)끼리의 AND 연산
            answer++;            
        }
        n = n >> 1;
    }
        
    return answer;
    }
}