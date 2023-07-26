import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int maxSize = Math.max(rows, cols);

        int[][] answer = new int[maxSize][maxSize];

        for (int i = 0; i < maxSize; i++) {
            for (int j = 0; j < maxSize; j++) {
                if (i < rows && j < cols) {
                    answer[i][j] = arr[i][j];
                } else {
                    answer[i][j] = 0;
                }
            }
        }

        return answer;
    }
}
