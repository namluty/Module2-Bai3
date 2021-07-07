public class addElementArray {
    public static void main(String[] args) {
        int a[] = {1, 9, 9, 9, 4};
        int a2[] = insertNewE(a, 3, 2);
        showAll1(a2);
    }

    public static int[] insertNewE(int[] arr, int index, int newValue) {
        if (index < 0)
            return arr;
        else if (index > arr.length)
            return arr;
        else {
            int[] newArr = new int[arr.length + 1];
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = newValue;
            for (int i = index + 1; i < newArr.length; i++) {
                newArr[i] = arr[i - 1];
            }
            return newArr;
        }
    }

    public static void showAll1(int[] a) {
        if (a != null) {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }
        }
    }
}
