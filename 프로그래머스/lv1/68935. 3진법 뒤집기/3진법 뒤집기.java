import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder buf = new StringBuilder();
        while(n != 0) {
            buf.append(n % 3);
            n /= 3;
        }
        return Integer.parseInt(buf.toString(), 3);
    }
}