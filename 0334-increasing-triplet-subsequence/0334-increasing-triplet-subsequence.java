class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = Integer.MAX_VALUE;
        int m = Integer.MAX_VALUE;
        
        for(int tmp : nums){
            if(tmp <= n){
                n = tmp;
            }else if(tmp <= m){
                m = tmp;
            }else{
                return true;
            }
        }
        return false;
    }
}