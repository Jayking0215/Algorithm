class Solution {
    public String solution(String s) {
        StringBuilder buf = new StringBuilder();
        String[] str = s.toLowerCase().split("");
        boolean flag = true;
        
        for(String ss : str){
            buf.append(flag ? ss.toUpperCase() : ss);
            flag = (ss.equals(" ")) ? true : false;
        }
        
        return buf.toString();
    }
}


// class Solution {
//     public String solution(String s) {
//         String answer = "";
//         String[] arr=s.split(" ");
        
//         for(int i=0; i<arr.length; i++){
//             if(arr[i].length()==0){
//                 answer+=" ";
//             }else{
//                 answer+=arr[i].substring(0, 1).toUpperCase();
//                 answer+=arr[i].substring(1, arr[i].length()).toLowerCase();
//                 answer+=" ";
//             }
//         }
//         if(s.substring(s.length()-1, s.length()).equals(" ")){
//              return answer;   
//         }
//         return answer.substring(0, answer.length()-1);
//     }
// }