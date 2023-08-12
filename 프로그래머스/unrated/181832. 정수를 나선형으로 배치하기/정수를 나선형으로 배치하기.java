class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int val = 1;
        int minRow = 0, minCol = 0, maxRow = n - 1, maxCol = n - 1;

        while(val <= n * n){
            for(int i = minCol; i <= maxCol; i++){
                answer[minRow][i] = val++;
            }
            minRow++;

            for(int i = minRow; i <= maxRow; i++){
                answer[i][maxCol] = val++;
            }
            maxCol--;

            for(int i = maxCol; i >= minCol; i--){
                answer[maxRow][i] = val++;
            }
            maxRow--;

            for(int i = maxRow; i >= minRow; i--){
                answer[i][minCol] = val++;
            }
            minCol++;
        }

        return answer;
    }
}
