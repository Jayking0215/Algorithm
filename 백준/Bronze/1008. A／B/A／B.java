import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if (B == 0) {
            System.out.println("분모 0");
        } else {
            double divide = (double)A / B;
            System.out.println(divide);
        }
        scanner.close();
    }
}
