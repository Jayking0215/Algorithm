import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i - 1]){
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}

// import java.util.*;
// public class Solution {
//     public Stack<Integer> solution(int []arr) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(arr[0]);
        
//         for(int i = 1; i < arr.length; i++){
//             if(stack.peek() != arr[i]){
//                 stack.push(arr[i]);
//             }
//         }
        
//         return stack;
//     }
// }