class Solution {
    public String solution(int q, int r, String code) {

        StringBuilder buf = new StringBuilder();

        for (int i = r; i < code.length(); i += q)
            buf.append(code.charAt(i));

        return buf.toString();
    }
}