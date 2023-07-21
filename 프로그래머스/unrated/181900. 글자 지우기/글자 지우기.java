import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int j = 0;
        Arrays.sort(indices);
        
        for(int i = 0; i < my_string.length(); i++){
            if(j < indices.length && i == indices[j] ){
                j++;
                continue;
            }else{
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}