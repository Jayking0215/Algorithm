import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a = 0;
        int b = 0;
        int c = 1;
        
        if(n == 1){
            a = 0;
            b = slicer[1] + 1;
        }else if(n == 2){
            a = slicer[0];
            b = num_list.length;
        }else if(n == 3){
            a = slicer[0];
            b = slicer[1] + 1;
        }else{
            a = slicer[0];
            b = slicer[1] + 1;
            c = slicer[2];
        }
        
        for(int i = a; i < b; i += c){
            list.add(num_list[i]);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}