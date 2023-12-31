class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        
        while(!s.equals("1")){
            answer[1] += s.length();
            s = s.replaceAll("0", "");
            cnt = s.length();
            s = Integer.toBinaryString(cnt);
            answer[0]++;
            answer[1] -= cnt;
        }
        
        return answer;
    }
}

// class Solution {
//     public int[] solution(String s) {
//         int[] answer = new int[2];//[변환횟수, 제거된 총0] 
//         int temp;
//         while( !s.equals("1") ) {
//             answer[1] += s.length();
//             s = s.replaceAll("0", "");
//             temp = s.length();
//             s = Integer.toBinaryString(temp);
//             answer[0]++;
//             answer[1] -= temp;
//         }
//         return answer;  
//     }
// }