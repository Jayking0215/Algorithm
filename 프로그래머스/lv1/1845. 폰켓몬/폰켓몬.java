import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;
        
        for(int tmp : nums){
            set.add(tmp);
        }
        
        if(set.size() > nums.length / 2){
            answer = nums.length / 2;
        }else{
            answer = set.size();
        }
        
        return answer;
    }
}