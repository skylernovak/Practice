package arrayHelper;

import java.util.Arrays;

public class ArrayHelper {
    private static final int SHORT_ARR_SIZE = 10;

    private static int shortArrSize;
    private static int[] shortArray;
    //private static int[] shortArray = initShortArray();

    public ArrayHelper() {

        shortArrSize = SHORT_ARR_SIZE;
        shortArray = new int[SHORT_ARR_SIZE];
        Arrays.setAll(shortArray, p -> p > shortArray.length ? 0 : p);

    }

    public static int[] initArray(int[] myArr) {
        Arrays.setAll(myArr, p -> p > myArr.length ? 0 : p);
        return myArr;
    }

    public static int getShortArrSize() {
        return shortArrSize;
    }

    public static int[] getShortArr() {
        //ArrayHelper();
        return shortArray;
    }

    public static void printShortArr() {
        for (int i = 0; i < shortArray.length; i++) {
            System.out.print(shortArray[i] + " ");
        }
    }

    public static void printArr(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
    }
}
