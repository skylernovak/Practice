package arrayhelper;

class ArrayHelper {

    private static final int SHORT_ARR_SIZE = 10;
    private static int[] shortArray = new int[SHORT_ARR_SIZE];
    //private static int[] shortArray = initShortArray();

    public ArrayHelper() {
        shortArray = new int[SHORT_ARR_SIZE];
        initArray(shortArray);
    }

    private void initArray(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = i+1;
        }
    }

    public static int[] getShortArr() {
        //ArrayHelper();
        return shortArray;
    }

    public static void printArr(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
    }
}

