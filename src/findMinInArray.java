public class findMinInArray {
    public static void main(String[] args) {
        int[] number = {3, 4, 6, 87, 3, 2, 8, 99};
        int index = minValue(number);
        System.out.println("Số nhỏ nhất trong mảng là:" + number[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
