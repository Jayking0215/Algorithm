class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int n : numbers){
            answer += n;
        }
        answer = 45 - answer;
        return answer;
    }
}

// class Solution {
//     public int solution(int[] numbers) {
//         int answer = -1;
//         int a=0;
//         for(int i=0; i<numbers.length; i++){
//             a+=numbers[i];
//         }
//         answer=45-a;
//         return answer;
//     }
// }