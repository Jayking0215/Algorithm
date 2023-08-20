class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right - left + 1);
        int[] answer = new int[len];
        int idx = 0;

        for(long i = left; i <= right; i++) {
            long row = i / n + 1;
            long col = i % n + 1;
            answer[idx++] = (int)Math.max(row, col);
        }

        return answer;
    }
}
