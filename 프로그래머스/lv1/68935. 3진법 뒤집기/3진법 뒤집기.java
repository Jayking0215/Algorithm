class Solution {
    public int solution(int n) {
        StringBuilder buf = new StringBuilder();
        int answer = 0;
        
        while(n != 0){//3진법 역순
            buf.append(n % 3);
            n /= 3;
        }
        
        answer = Integer.parseInt(buf.toString(), 3);
        
        return answer;
    }
}

// import java.uti l.*;
// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         StringBuilder buf = new StringBuilder();
//         while(n != 0) {
//             buf.append(n % 3);
//             n /= 3;
//         }
//         return Integer.parseInt(buf.toString(), 3);
//     }
// }