//비트연산 | (OR연산...1이면 1로 변환) &(둘 다 1일경우 1로 변환) ^(다를경우 1)
//이진수로 변환  toBinaryString
//앞자리 0 채우기
//.replaceAll("1", "#")
//.replaceAll("0", " ")

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            int bitOr = arr1[i] | arr2[i];
            String str = Integer.toBinaryString(bitOr);
            
            while(str.length() < n){
                str = "0" + str;//부족한 앞자리 채우기
            }
            
            str = str.replaceAll("1", "#");
            str = str.replaceAll("0", " ");
            
            answer[i] = str;
        }
        return answer;
    }
}