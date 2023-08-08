class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            int birOr = arr1[i] | arr2[i];
            String str = Integer.toBinaryString(birOr);
            
            while (str.length() < n) {
                str = "0" + str; // 부족한 자릿수 채우기
            }
            
            str = str.replaceAll("1", "#");
            str = str.replaceAll("0", " ");
            
            answer[i] = str;
        }
        
        return answer;
    }
}
