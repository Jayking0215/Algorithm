import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            Collections.sort(list, Collections.reverseOrder());

            int[] arr = new int[Math.min(k, list.size())];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = list.get(j);
            }

            Arrays.sort(arr);
            answer[i] = arr[0];
        }

        return answer;
    }
}
