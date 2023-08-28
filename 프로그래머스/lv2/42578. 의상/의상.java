import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
    int answer = clothes.length;
    HashMap<String, Integer> map = new HashMap<>();

    for(int i=0; i<clothes.length; i++) {
        map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
    }
    //2가지 이상의 종류인경우
    if(map.size() > 1) {
        int count = 1;
        for(String key : map.keySet()){
            count *= map.get(key) + 1;
        }
        answer = count - 1;//아무것도 입지 않은 경우
    }

        return answer;
    }
}