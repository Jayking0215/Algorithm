class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder buf = new StringBuilder();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for(String a : X.split("")){//X에 포함된 숫자 갯수 count
            arr1[Integer.parseInt(a)]++; 
        }

        for(String b : Y.split("")){//Y에 포함된 숫자 갯수 count
            arr2[Integer.parseInt(b)]++; 
        }

        for(int i = 9; i >= 0; i--){//큰 수 부터 차례로 추가
            if(arr1[i] > 0 && arr2[i] > 0){//X, Y 모두 포함되어 있을 때
                int tmp = Math.min(arr1[i], arr2[i]);
                for(int j = 0; j < tmp; j++){
                    buf.append(i);
                }
            }
        }

        if(buf.length() > 0){
            answer = buf.charAt(0) == '0' ? "0" : buf.toString();
        }else{
            answer = "-1";
        }

        return answer;
    }
}