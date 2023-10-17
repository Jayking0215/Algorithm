import java.util.*;

class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        
        Arrays.sort(nums);
        
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for(int key : map.keySet()){
            cnt += map.get(key)/2; //key값에 해당하면 value값
        }
        
        return cnt == nums.length / 2;
    }
}
