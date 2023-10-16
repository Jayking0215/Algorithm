class Solution {
    
//     public int[] evenOddBit(int n) {
        
//     return new int[] {Integer.bitCount(n & 0b0101010101), 
//                       Integer.bitCount(n & 0b1010101010)};
//     }
    
    public int[] evenOddBit(int n) {
        int x = 1 << 9;//512(10)
		int even = 0;
        int odd = 0;
		int i = 0;
		int [] ans = new int[2];
        
		while(i < 10){
			if((n & x) > 0 && i % 2 == 0){
				odd++;                
            }
			else if((n & x ) > 0 && i % 2 == 1){
				even++;                
            }
			i++;
			x = x >> 1;
		}
        
		ans[0] = even;
        ans[1] = odd;
		return ans;
	}
}

