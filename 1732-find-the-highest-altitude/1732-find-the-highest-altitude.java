import java.util.*;

class Solution {
    public int largestAltitude(int[] gain) {
        int answer = 0;
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;

        for (int i = 0; i < gain.length; i++) {
            arr[i + 1] = arr[i] + gain[i];
            answer = Math.max(answer, arr[i + 1]);
        }

        return answer;
    }
}
