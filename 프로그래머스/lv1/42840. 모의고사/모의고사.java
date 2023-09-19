import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == a[i % a.length]){
                cnt1++;
            }
            if(answers[i] == b[i % b.length]){
                cnt2++;
            }
            if(answers[i] == c[i % c.length]){
                cnt3++;
            }
        }
        
        int max = Math.max(Math.max(cnt1, cnt2), cnt3);
        List<Integer> list = new ArrayList<>();
        
        if(max == cnt1){
            list.add(1);
        }
        if(max == cnt2){
            list.add(2);
        }
        if(max == cnt3){
            list.add(3);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}