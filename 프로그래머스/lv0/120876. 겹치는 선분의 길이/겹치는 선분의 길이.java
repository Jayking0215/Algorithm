class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        //여러 선분이 겹쳐도 1개만 겹치는 것으로 판단
        //선분 범위 안에 i가 존재한다면 cnt++
        //cnt > 1이면 두 선분에 걸린다는 뜻 = answer++
        for (int i = -100; i < 100; i++) {
            int cnt = 0;
            if (lines[0][0] <= i && i < lines[0][1]) {
                cnt++;
            }
            if (lines[1][0] <= i && i < lines[1][1]) {
                cnt++;
            }
            if (lines[2][0] <= i && i < lines[2][1]) {
                cnt++;
            }

            if (cnt > 1) {
                answer++;
            }
        }

        return answer;
    }
}
