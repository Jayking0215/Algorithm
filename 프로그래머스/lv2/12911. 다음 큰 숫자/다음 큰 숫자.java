class Solution {
    public int solution(int n) {
        String str = Integer.toBinaryString(n);
        int answer = 0;
        int cnt = 0;
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                cnt++;
            }
        }
        
        for(int i = n + 1; i < 1000000; i++){
            String bi_str = Integer.toBinaryString(i);
            int bi_cnt = 0;
            
            for(int j = 0; j < bi_str.length(); j++){
                if(bi_str.charAt(j) == '1'){
                    bi_cnt++;
                }
            }
            if(cnt == bi_cnt){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         String str = Integer.toBinaryString(n);
//         int cnt =0;
        
//         for(int i = 0; i < str.length(); i++){
//             if(str.charAt(i) == '1') cnt++;
//         }
        
//         for(int i = n + 1; i < 1000000; i++){
//             String bi = Integer.toBinaryString(i);
//             int bi_cnt = 0;
//             for(int j = 0; j < bi.length(); j++){
//                 if(bi.charAt(j) == '1') bi_cnt++;
//             }
//             if(bi_cnt == cnt) {
//                 answer = i;
//                 break;
//             }
//         }
        
//         return answer;
//     }
// }

// //2진수의 1의 갯수 cnt를 
// //String bi = Integer.toBinaryString(i);
// //int bi_cnt = bi.replaceAll("0", "").length();
// //에서
// //for문으로 변경(효율성 부분에서 for문이 더 유리함)