import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();//낮은 수가 우선순위를 갖는다.
        int temp = 0;

        for(int i = 0; i < score.length; i++) {
            pq.add(score[i]);
            if (pq.size() > k) {
                pq.poll();
            }
            answer[i] = pq.peek();
        }

        return answer;
    }
}