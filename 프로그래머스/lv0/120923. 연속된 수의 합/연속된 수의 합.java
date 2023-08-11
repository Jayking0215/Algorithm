class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int check = num*(num+1) / 2;//1~num까지 자연수의 합
        int start = (total - check) / num + 1;
        
        for (int i = 0; i < num; i++) {
                answer[i] = start + i ;
        }
        return answer;
    }
}