import java.util.Arrays;

public class mergeArray {

    public static void main(String[] args) {
        int[] array1 = {1, 9, 9, 2};
        int[] array2 = {1, 9, 9, 4};
        int length = array1.length + array2.length;
        int[] result = new int[length];
        int link = 0;
        for (int element : array1) {
            result[link] = element;
            link++;
        }
        for (int element : array2) {
            result[link] = element;
            link++;
        }
        System.out.println(Arrays.toString(result));
    }
}

//import java.util.Arrays;
//
//public class mergeArray {
//    public static void main(String[] args) {
//        int a[] = {1, 9, 9, 2};
//        int b[] = {1, 9, 9, 4};
//        int aLeng = a.length;
//        int bLeng = b.length;
//        int[] totalArray = new int[aLeng + bLeng];
//        System.arraycopy(a, 0, totalArray, 0, aLeng);
//        System.arraycopy(b, 0, totalArray, aLeng, bLeng);
//        System.out.println(Arrays.toString(totalArray));
//    }
//}