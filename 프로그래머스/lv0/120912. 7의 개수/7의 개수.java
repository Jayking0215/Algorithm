class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            String str = String.valueOf(array[i]);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}

//for (int num : array) {
//    while (num >= 1) {
//        if (num % 10 == 7) answer++;
//        num /= 10;
//    }
//}
