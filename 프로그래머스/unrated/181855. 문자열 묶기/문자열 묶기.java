import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;

        for (String str : strArr) {
            map.put(str.length(), map.getOrDefault(str.length(), 0) + 1);
        }

        for (int cnt : map.values()) {
            answer = Math.max(answer, cnt);
        }

        return answer;
    }
}
