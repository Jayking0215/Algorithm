// class Solution {
//     public int numberOfSteps(int num) {
//         int cnt = 0;
        
//         while(num != 0){
//             if(num % 2 == 0){
//                 num /= 2;
//                 cnt++;
//             }else{
//                 num -= 1;
//                 cnt++;
//             }
//         }
        
//         return cnt;
//     }
// }
//이해 안됨...
// public int numberOfSteps (int num) {
// 	return Integer.toBinaryString(num).length() - 1 + Integer.bitCount(num);
// }
class Solution{
    public int numberOfSteps(int num) {
        int count = 0;

        while (num > 0) {
            num = (num & 1) == 1 ? num ^ 1 : num >> 1;
            count++;
        }
        return count;
    }
}
//(num & 1) ... 짝수 판별 비트연산
//결과가 1이면 홀수
//num ^ 1...가장 오른쪽 비트 반전 = 1 빼는것과 같다
//num >> 1...오른쪽 1 시프트 연산 = 2로 나눈것과 같다 ex) 1000(=8) >> 1 == 0100(=4)