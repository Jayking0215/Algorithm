import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack();
        for(int i : arr ){
            if(stack.isEmpty()){
                stack.push(i);
                continue;
            }
            while(!stack.isEmpty() && i <= stack.peek()) {
                stack.pop();
            }
            stack.push(i);
        }
        int[] answer = new int[stack.size()];
        for(int i=0; i<answer.length; i++) {
            answer[answer.length - 1 - i] = stack.pop();
        }
        return answer;
    }
}