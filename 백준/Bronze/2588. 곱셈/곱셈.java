import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int abc = sc.nextInt();
        
        int c = abc % 10; // 1의 자리
        abc /= 10;
        int b = abc % 10; // 10의 자리
        abc /= 10;
        int a = abc; // 100의 자리
        
        int Aabc = A * (a * 100 + b * 10 + c);
        
        System.out.println(A * c);
        System.out.println(A * b);
        System.out.println(A * a);
        System.out.println(Aabc);
        
        sc.close();
    }
}
