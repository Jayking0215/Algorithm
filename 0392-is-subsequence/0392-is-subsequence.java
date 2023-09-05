class Solution {
    public boolean isSubsequence(String s, String t) {
        int tmp = 0;
        
        if(s.length() < 1){
            return true;
        }
        for(int i = 0; i < t.length(); i++){
            if(s.charAt(tmp) == t.charAt(i)){
                tmp++;
            }
            if(tmp == s.length()){
                return true;
            }
        }
        return false;
    }
}