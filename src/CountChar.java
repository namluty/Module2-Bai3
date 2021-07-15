import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String stringList;
        char kyTu = 'a';
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        stringList = scanner.nextLine();

        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < stringList.length(); i++) {
            // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
            if (stringList.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + stringList + " = " + count);
    }
}
