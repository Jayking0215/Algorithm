// import java.util.*;
// class Solution {
//     public String reverseWords(String s) {
//         String[] arr = s.split(" ");
//         StringBuilder buf = new StringBuilder();
        
//         for(int i = arr.length - 1; i >= 0; i--){
//             buf.append(arr[i]);
//             if(i > 0){
//                 buf.append(" ");
//             }    
//         }
        
//         return buf.toString();
//     }
// }


public class Solution {
    public String reverseWords(String s) {
        String [] arr = s.split(" ");
        StringBuilder buf = new StringBuilder();
        
        for(int i = 0; i<= arr.length - 1; i++){
            if(!arr[i].isEmpty()) {
                buf.insert(0, arr[i]);
                if(i < arr.length - 1){
                    buf.insert(0, " ");
                }
            }
        
        }
        
        return buf.toString();
    }
}