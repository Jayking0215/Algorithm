class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toBinaryString(n);
        int cnt =0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1') cnt++;
        }
        for(int i = n + 1; i < 1000000; i++){
            String bi = Integer.toBinaryString(i);
            int bi_cnt = 0;
            for(int j = 0; j < bi.length(); j++){
                if(bi.charAt(j) == '1') bi_cnt++;
            }
            if(bi_cnt == cnt) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}