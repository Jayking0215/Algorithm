class Solution {
    public String[] solution(String my_str, int n) {
        int size = (my_str.length() + n - 1) / n;
        String[] answer = new String[size];
        
        int cnt = 0;
        for (int i = 0; i < my_str.length(); i += n) {
            int lst = Math.min(i + n, my_str.length());
            answer[cnt] = my_str.substring(i, lst);
            cnt++;
        }
        
        return answer;
    }
}
