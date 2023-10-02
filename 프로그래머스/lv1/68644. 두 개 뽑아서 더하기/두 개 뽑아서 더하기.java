import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(set);
        int[] answer = new int[list.size()];
        
        Collections.sort(list);
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

// import java.util.*;
// class Solution {
//     public int[] solution(int[] numbers) {
//         HashSet<Integer> set=new HashSet<>();
        
//         for(int i=0; i<numbers.length; i++){
//             for(int j=i+1; j<numbers.length; j++){
//                 set.add(numbers[i]+numbers[j]);//hashset은 중복값을 갖지 않는다.   
//             }
//         }
//         ArrayList<Integer> list=new ArrayList<>(set);//sort하기 위해 list타입으로 변경
//         Collections.sort(list);
//         //System.out.println(arr);
        
//         int[] answer=new int[list.size()];//최종 결과물 answer선언
//         // int index=0;  //향상된for문 연습
//         // for(int arr:list){
//         //     answer[index++]=arr;
//         // } 
//         for(int i=0; i<list.size(); i++){
//             answer[i]=list.get(i);
//         }
        
//         return answer;
//     }
// }


// //Set<Integer> set=new TreeSet<>(): //중복값x 순서정렬o
// //HashSet을 먼저 answer에 대입 후 sort하면 Collections할 필요 없음