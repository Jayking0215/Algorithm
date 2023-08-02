import java.math.BigInteger;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        StringBuilder buf = new StringBuilder();
        BigInteger Bigp = new BigInteger(p);
        
        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            buf.setLength(0);
            for (int j = 0; j < p.length(); j++) {
                buf.append(t.charAt(i + j));
            }
            BigInteger Bigbuf = new BigInteger(buf.toString());
            if (Bigbuf.compareTo(Bigp) <= 0) {
                answer++;
            }
        }
        
        return answer;
    }
}
