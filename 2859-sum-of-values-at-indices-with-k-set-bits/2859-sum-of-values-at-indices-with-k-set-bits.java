class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        //index의 bitCount가 k와 같을때 sum에 추가
        for(int i = 0; i < nums.size(); i++){
            if(Integer.bitCount(i) == k){
                sum += nums.get(i);
            }
        }
        return sum;
    }
}