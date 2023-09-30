class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < arr.length; i++){
            s = s.replaceAll(arr[i], Integer.toString(i));
        }
        
        answer = Integer.parseInt(s);

        return answer;
    }
}

// class Solution {
//     public int solution(String s) {
//         int answer = 0;
//         //String str=s;
//         s=s.replace("zero", "0")
//              .replace("one", "1")
//              .replace("two", "2")
//              .replace("three", "3")
//              .replace("four", "4")
//              .replace("five", "5")
//              .replace("six", "6")
//              .replace("seven", "7")
//              .replace("eight", "8")
//              .replace("nine", "9");
//         answer=Integer.parseInt(s);
//         return answer;
//     }
// }

// // String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
// // for(int i = 0; i < strArr.length; i++) {
// //     s = s.replaceAll(strArr[i], Integer.toString(i));
// // }
