//1,2,2,3,3,4,5,5
//종류별 개수를 list에 저장
//내림차순 정렬
//k에서 차감
import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        ArrayList<Integer> list = new ArrayList<>();
        int answer = 1;
        int cnt = 1;
        
        Arrays.sort(tangerine);
        
        //list에 종류별 개수 저장하기
        for(int i = 1; i < tangerine.length; i++){
            if(tangerine[i - 1] == tangerine[i]){
                cnt++;
            }else{
                list.add(cnt);
                cnt = 1;
            }
        }
        //마지막 종류의 개수 저장
        list.add(cnt);
        //내림차순 정렬(Collections는 list, map 등의 정렬에 사용)
        Collections.sort(list, Collections.reverseOrder());
        //k에서 종류 개수만큼 차감시키면서 최솟값 반환하기
        for(int i = 0; i < list.size(); i++){
            k -= list.get(i);
            if(k > 0){
                answer++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}
