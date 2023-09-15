//A+B+C의 값을 출력한다.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        long total = A + B + C;

        System.out.println(total);
        sc.close();
    }
}
