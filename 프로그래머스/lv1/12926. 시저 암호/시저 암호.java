class Solution {
    public String solution(String s, int n) {
        StringBuilder buf = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == ' '){
                buf.append(' ');
                continue;
            }
            if('a' <= ch && 'z' >= ch){
                if(ch + n > 'z'){
                    buf.append((char)(ch - 26 + n));
                }else{
                    buf.append((char)(ch + n));
                }
            }else if('A' <= ch && 'Z' >= ch){
                if(ch + n > 'Z'){
                    buf.append((char)(ch - 26 + n));
                }else{
                    buf.append((char)(ch + n));
                }
            }
        }
        
        return buf.toString();
    }
}

// public class Solution {
// 	public String solution(String s, int n) {
// 		String answer = "";
//         StringBuilder buf = new StringBuilder();
        
// 		for(int i = 0; i < s.length(); i++) {
// 			char ch = s.charAt(i);
            
//             if(ch == ' ') {//공백처리
// 				buf.append(ch);
// 				continue;
// 			}
// 			if(ch >= 'a' && ch <= 'z') {//소문자인 경우
// 				if(ch + n > 'z') {//'z'를 넘어갈 경우
// 					buf.append((char)(ch - 26 + n));
// 				}else {
// 					buf.append((char)(ch + n));
// 				}
// 			}else if(ch >= 'A' && ch <= 'Z') {//대문자인 경우
// 				if(ch + n > 'Z') {//'Z'를 넘어갈 경우
// 					buf.append((char)(ch - 26 + n));
// 				}else {
// 					buf.append((char)(ch + n));
// 				}
// 			}
// 		}
//         answer = buf.toString();
// 		return answer;
// 	}
// }