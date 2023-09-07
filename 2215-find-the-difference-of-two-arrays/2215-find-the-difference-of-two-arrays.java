class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();        
        
        //중복제거
        for(int n : nums1){
            set1.add(n);
        }
        for(int n : nums2){
            set2.add(n);  
        } 
        
        for (int n : set1){
            if(set2.contains(n) == false){
                list1.add(n);
            }
        }
        for (int n : set2){
            if(set1.contains(n) == false){
                list2.add(n);
            }
        }
        
        answer.add(list1);
        answer.add(list2);
        
        return answer;
    }
}