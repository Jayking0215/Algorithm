//for()
//int[] arr = Arrays.copyOfRange(commands[i][0] - 1, commands[i][1])
//Arrays.sort(arr)
//answer[i] = arr[commands[i][2];
import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }
        
        return answer;
    }
}

// import java.util.*;
// class Solution {
//     public int[] solution(int[] array, int[][] commands) {
//         int[] answer = new int[commands.length];
        
//         for(int i = 0; i < commands.length; i++){
//             int start = commands[i][0] - 1;
//             int end = commands[i][1];
            
//             int[] arr = new int[end - start];
//             int idx = 0;
            
//             for(int j = start; j < end; j++){
//                 arr[idx] = array[j];
//                 idx++;
//             }
//             Arrays.sort(arr);
//             answer[i] = arr[commands[i][2] - 1];
            
//         }
        
//         return answer;
//     }
// }