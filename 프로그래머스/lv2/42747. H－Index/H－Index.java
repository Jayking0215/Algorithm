import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        int hindex = 0;
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = Math.min(citations[i], n - i);
            hindex = Math.max(hindex, h);
        }
        
        return hindex;
    }
}
