import java.util.Scanner;

public class deleteElementArray {
    public static void main(String[] args) {
        int a, i, c;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            a = scanner.nextInt();
        } while (a <= 0);
        int array[] = new int[a];
        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < a; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập số X: ");
        int x = scanner.nextInt();
        for (c = i = 0; i < a; i++) {
            if (array[i] != x) {
                array[c] = array[i];
                c++;
            }
        }
        a = c;
        System.out.println("Mảng còn lại sau khi xóa phần tử X =" + x + " là: ");
        for (i = 0; i < a; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}