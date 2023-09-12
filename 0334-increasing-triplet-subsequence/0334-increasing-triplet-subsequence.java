class Solution {
    public boolean increasingTriplet(int[] nums) {
       int tmp1 = Integer.MAX_VALUE;
       int tmp2 = Integer.MAX_VALUE;
        
       for(int n : nums) {
           if(n <= tmp1){
               tmp1 = n;
           } 
           else if(n <= tmp2){
               tmp2 = n;  
           } 
           else{
               return true;
           } 
       }
        
       return false;
    }
}