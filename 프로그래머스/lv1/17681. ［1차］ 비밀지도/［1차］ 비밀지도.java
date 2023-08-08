class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        StringBuilder buf = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            int bitOr = arr1[i] | arr2[i];
            String str = Integer.toBinaryString(bitOr);
            
            while (str.length() < n) {
                str = "0" + str;//자릿수 맞추기
            }
            
            for(int j = 0; j < n; j++){
                if(str.charAt(j) == '1'){
                    buf.append("#");
                }else{
                    buf.append(" ");
                }
            }
            
            answer[i] = buf.toString();
            buf.setLength(0);
        }
        
        return answer;
    }
}
