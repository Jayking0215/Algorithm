class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] mdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0;
        
        for (int i = 0; i < a - 1; i++) {
            total += mdays[i];
        }
        
        total += b - 1;//0부터 시작하므로 -1
        int wdays = (total + 5) % 7;//금요일부터 시작 = +5
        
        return days[wdays];
    }
}
//LocalDate함수 활용(java 8)
//LocalDate date = LocalDate.of(2016, a, b);
//return date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase();