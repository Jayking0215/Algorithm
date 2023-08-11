class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total / num - (num - 1) / 2;
        int sum = 0;
        
        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
            sum += answer[i];
        }

        int diff = total - sum;
          
        for (int i = num - 1; i >= 0 && diff > 0; i--) {
            int add = Math.min(diff, num - answer[i]);
            answer[i] += add;
            diff -= add;
        }

        return answer;
    }
}
