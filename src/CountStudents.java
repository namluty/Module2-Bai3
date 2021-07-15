import java.util.Scanner;

public class CountStudents {
    public static void main(String[] args) {
        int sizeStudents;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size class student:");
            sizeStudents = scanner.nextInt();
            if (sizeStudents > 10)
                System.out.println("Size student not exceed 20");
        } while (sizeStudents > 10);
        array = new int[sizeStudents];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter a point for student" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("List of point: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.println("\n The number of students pass the exam is " + count);
    }
}
