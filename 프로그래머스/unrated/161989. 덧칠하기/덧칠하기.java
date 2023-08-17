class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int tmp = 1;
        
        for(int i = 0; i < section.length; i++){
            if(section[i] - tmp >= 0){
                answer++;
                tmp = section[i] + m;
            }
        }
        
        return answer;
    }
}