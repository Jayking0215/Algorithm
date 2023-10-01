import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        ArrayList<String> list = new ArrayList<>();
        int[] answer = new int[2];       
        
        list.add(words[0]);
        
        for(int i = 1; i < words.length; i++){
            int player = i % n + 1;
            int turn = i / n + 1;
            
            //중복단어가 나타났을 경우
            if(list.contains(words[i])){
                answer[0] = player;
                answer[1] = turn;
                break;
            }else{
                answer[0] = 0;
                answer[1] = 0;
            }
            list.add(words[i]);
            //마지막 글자와 첫글자가 다른경우
            if(words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)){
                answer[0] = player;
                answer[1] = turn;
                break;
            }
        }
        return answer;
    }
}

// import java.util.*;
// class Solution {
//     public int[] solution(int n, String[] words) {
//         ArrayList<String> list=new ArrayList<>();//나온 단어 비교용 list
//         int[] answer =new int[2];

//         for(int i=0; i<words.length; i++){
//             int player=(i%n)+1;
//             int turn=(i/n)+1;
//             if(list.contains(words[i])){//words[i]가 word[]에 포함되어 있다면
//                 answer[0]=player;
//                 answer[1]=turn;
//                 break;
//             }else{//탈락자 없을 경우
//                 answer[0]=0;
//                 answer[1]=0;
//             }
//             list.add(words[i]);
//             //[i-1]맨 끝자 != [i]인 경우
//             if(i>0 && (words[i].charAt(0)!=words[i-1].charAt(words[i-1].length()-1))){
//                 answer[0]=player;
//                 answer[1]=turn;
//                 break;
//             }
//         }
//         return answer;
//     }
// }