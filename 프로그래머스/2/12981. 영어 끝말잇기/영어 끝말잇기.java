import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        ArrayList<String> list = new ArrayList<>();
        int[] answer = new int[2];       
        
        //첫번째 단어 list에 저장
        list.add(words[0]);
        
        for(int i = 1; i < words.length; i++){
            int player = i % n + 1;//n번째 사람이기 때문에 1부터 시작
            int turn = i / n + 1;//마찬가지 n번째 턴
            
            //중복단어가 나타났을 경우
            if(list.contains(words[i])){
                answer[0] = player;
                answer[1] = turn;
                break;
            }
            
            list.add(words[i]);
            
            //이전 단어의 마지막 글자와 다음 단어 첫글자가 다른경우
            if(words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)){
                answer[0] = player;
                answer[1] = turn;
                break;
            }
        }
        return answer;
    }
}