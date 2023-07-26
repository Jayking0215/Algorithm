import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        if (balls == share) {
            return 1;
        }

        BigInteger answer = BigInteger.ONE;
        BigInteger n = BigInteger.ONE;
        BigInteger m = BigInteger.ONE;
        BigInteger o = BigInteger.ONE;

        for (int i = balls; i > 0; i--) {
            n = n.multiply(BigInteger.valueOf(i));
        }

        for (int j = share; j > 0; j--) {
            m = m.multiply(BigInteger.valueOf(j));
        }

        for (int k = balls - share; k > 0; k--) {
            o = o.multiply(BigInteger.valueOf(k));
        }

        answer = n.divide(o.multiply(m));

        return answer.intValue();
    }
}
