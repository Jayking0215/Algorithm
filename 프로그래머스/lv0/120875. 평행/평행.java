class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] line1 = new int[2];
        int[] line2 = new int[2];

        for(int i = 0; i < 3; i++){
            line1[0] = dots[3][0] - dots[i][0];
            line1[1] = dots[3][1] - dots[i][1];
            line2[0] = dots[(i + 1) % 3][0] - dots[(i + 2) % 3][0];
            line2[1] = dots[(i + 1) % 3][1] - dots[(i + 2) % 3][1];

            if((double)line1[1] / line1[0] == (double)line2[1] / line2[0]){
                answer = 1;
                break;
            } 
        }

        return answer;
    }
}