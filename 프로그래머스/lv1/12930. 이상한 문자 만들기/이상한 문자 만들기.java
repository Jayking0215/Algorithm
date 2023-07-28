class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder buf = new StringBuilder();
        int cnt = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                buf.append(" ");
                cnt = 0;
            } else {
                if (cnt % 2 == 0) {
                    buf.append(Character.toUpperCase(ch));
                } else {
                    buf.append(Character.toLowerCase(ch));
                }
                cnt++;
            }
        }
        answer = buf.toString();
        return answer;
    }
}
