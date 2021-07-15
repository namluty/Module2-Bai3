import java.util.Scanner;

public class CrossoverArray {
    public static void main(String[] args) {
        int n;  // bậc của ma trận
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số bậc của ma trận: ");
            n = scanner.nextInt();
        } while (n < 1);

        int[][] A = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "," + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)     // Điều kiện để tạo nên đường chéo chính
                {
                    sum += A[i][j];
                }
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
    }
}
