class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int cnt=0;
        
        while(xor > 0) {
            xor = xor & (xor-1);
            cnt++;
        }
        return cnt;
    }
}

// class Solution {
//     public int minBitFlips(int start, int goal) {
//         return Integer.bitCount(start ^ goal);//1의 개수 count
//     }
// }

//숫자를 변경하고 싶을 때 비트xor연산으로 bitCount하면 된다.