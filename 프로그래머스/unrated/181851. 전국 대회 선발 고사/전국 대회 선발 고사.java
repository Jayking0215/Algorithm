import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int calc = 10000;
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < rank.length; i++) {
            if(!attendance[i]) {
                map.put(rank[i], -1);
                continue;
            }
            map.put(rank[i], i);
        }
        
        for(int r = 0; r < rank.length; r++) {
            if(map.get(r+1) != -1) {
                answer += calc*map.get(r+1);
                calc /= 100;
                cnt++;
            }
            if(cnt == 3) { break; }
        }
        return answer;
    }
}