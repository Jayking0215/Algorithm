class Solution {
    public int solution(int[][] board) {
        int[][] arr = new int[board.length][board[0].length];
        int answer = 0;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    for(int dx = -1; dx <= 1; dx++) {
                        for(int dy = -1; dy <= 1; dy++) {
                            int safeX = i + dx;
                            int safeY = j + dy;
                            if(safeX >= 0 && safeX < board.length && safeY >= 0 && safeY < board[0].length) {
                                arr[safeX][safeY] = 1;
                            }
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(arr[i][j] == 0){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
