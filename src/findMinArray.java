import java.util.Scanner;

public class findMinArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size:");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("Size không quá 20");
            }
        }
        while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("List input:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("Số nhỏ nhất trong danh sách là" + min + " ,tại vị trí" + index);
    }
}
