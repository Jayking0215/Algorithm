import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for(int i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        
        return participant[participant.length - 1];
    }
}

// import java.util.HashMap;

// class Solution {
//     public String solution(String[] participant, String[] completion) {
//         String answer = "";
//         HashMap<String, Integer> map = new HashMap<>();
        
//         for (String player : participant){
//             map.put(player, map.getOrDefault(player, 0) + 1);
//         } 
//         for (String player : completion){
//             map.put(player, map.get(player) - 1);
//         } 

//         for (String key : map.keySet()) {
//             if (map.get(key) != 0){
//                 answer = key;
//             }
//         }
//         return answer;
//     }
// }

