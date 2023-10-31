import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for(int t = 0; t < T; t++){
            int k = scanner.nextInt();
            int n = scanner.nextInt();

            int[] zerothFloor = new int[n];
            for(int i = 0; i < n; i++){
                zerothFloor[i] = i + 1;
            }

            for(int i = 0; i < k; i++){
                for(int j = 1; j < n; j++){
                    zerothFloor[j] += zerothFloor[j - 1];
                }
            }

            System.out.println(zerothFloor[n - 1]);
        }
    }
}
