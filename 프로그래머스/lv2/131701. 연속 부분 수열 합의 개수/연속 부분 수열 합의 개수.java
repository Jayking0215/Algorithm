import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();//중복저장 x
        
        for(int i = 1; i <= elements.length; i++){//부분합 길이(1~5)
            for(int j = 0; j < elements.length; j++){//부분합 시작위치(0~4)
                int sum = 0;
                for(int k = 0; k < i; k++) {//i길이만큼 부분합 계산
                    if(j + k > elements.length - 1){
                        sum += elements[j + k - elements.length];
                    }else{
                        sum += elements[j + k];
                    }
                }
                set.add(sum); 
            }
        }
        
        answer = set.size();
        return answer;
    }
}