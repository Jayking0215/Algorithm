import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder buf = new StringBuilder();
        
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        int i =0;
        for(String n : str){
            arr[i] = Integer.parseInt(n);
            i++;
        }
        
        Arrays.sort(arr); 
        buf.append(arr[0])
            .append(" ")
            .append(arr[arr.length - 1]);
        
        return buf.toString();
    }
}

// class Solution {
//     public String solution(String s) {
//         String answer = "";
//         String[] strings = s.split(" ");
//         int[] arr = new int[strings.length];
 
//         for(int i=0; i<strings.length; i++) {
//             arr[i]=Integer.parseInt(strings[i]);
//         }
//         int min=arr[0];
//         int max=arr[0];
//         for(int i=0; i<arr.length; i++) {
//             if(min>arr[i]) {
//                 min=arr[i];
//             }
//             if(max<arr[i]) {
//                 max=arr[i];
//             }
//         }
//         answer=min+" "+max;
//         return answer;
//     }
// }