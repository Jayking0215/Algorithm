class Solution {
    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int service = chicken / 10;
            int restChick = chicken % 10;
            chicken = service + restChick;
            answer += service;
        }

        return answer;
    }
}