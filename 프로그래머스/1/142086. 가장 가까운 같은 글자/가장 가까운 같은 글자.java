class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        StringBuilder buf = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            int tmp = buf.toString().lastIndexOf(s.charAt(i));//빈 buf라서 tmp = -1
            if(tmp == -1){//indexOf : 특정 문자열의 인덱스 반환, 없으면 -1 반환
                answer[i] = -1;
            }else{
                answer[i] = i - tmp;//buf추가 후 인덱스-추가 전 인덱스
            }
            buf.append(s.charAt(i));
        }
        
        return answer;
    }
}