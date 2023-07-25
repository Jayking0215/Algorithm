class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int cnt = 0;
        int[] tmp = new int[arr.length];
        
        while(cnt != arr.length) {
            cnt = 0;
            tmp = arr.clone();
            for(int i =0; i<arr.length; i++) {
                if(arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] /= 2;
                }else if(arr[i] % 2 == 1 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                }
                if(arr[i] == tmp[i]) cnt++;
            }
            answer++;
        }
        
        return answer-1;
    }
}