import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int tmp = budget;
        Arrays.sort(d);
        
        for(int i = 0; i < d.length; i++){
            tmp -= d[i];
            if(tmp < 0){
                answer = i;
                break;
            }else if(tmp >= 0){
                answer = d.length;
            }
        }
        
        return answer;
    }
}