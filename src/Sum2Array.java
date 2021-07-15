import java.util.Scanner;

public class Sum2Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng: ");
        int n = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
        }
        System.out.print(sum);
    }
}