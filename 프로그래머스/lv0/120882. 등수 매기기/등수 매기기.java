class Solution {
    public int[] solution(int[][] score){
        int[] answer = new int[score.length];
        int[] arr = new int[score.length];

        for(int i = 0; i < score.length; i++){
            arr[i] = score[i][0] + score[i][1];
        }

        for(int j = 0; j < arr.length; j++){
            answer[j] = 1;
            for(int k = 0; k < arr.length; k++){
                if(arr[j] < arr[k]){
                    answer[j]++;
                }
            }
        }

        return answer;
    }
}
