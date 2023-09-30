class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        int sqrt = (int)Math.sqrt(total);
        
        for(int i = sqrt; i > 0; i--){
            if(total % i == 0){
                int w = total / i;
                int h = i;
                
                int yt = (w - 2) * (h - 2);
                if(yt == yellow){
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }
        
        return answer;
    }
}


// class Solution {
//     public int[] solution(int brown, int yellow) {
//         int[] answer = new int[2];
//         int total = brown + yellow;
//         int sqrt = (int)Math.sqrt(total);
        
//         for(int i = sqrt; i >= 1; i--){
//             if(total % i == 0){
//                 int w = total / i;
//                 int h = i;
                
//                 int yt = (w -2) * (h -2);
//                 if(yt == yellow){
//                     answer[0] = w;
//                     answer[1] = h;
//                     break;
//                 }
//             }
//         }
        
        
//         return answer;
//     }
// }