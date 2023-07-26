import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger n = new BigInteger(a);
        BigInteger m = new BigInteger(b);

        BigInteger sum = n.add(m);
        answer = sum.toString();

        return answer;
    }
}
