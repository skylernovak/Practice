import arrayHelper.ArrayHelper;

public class ArrayPractice {

    public static void main(String[] args) {
        System.out.println("Hello Java Array Practice!");

        simple2DArr();
        //Play();

    }

    /**
     * creates ArrayHelper instance
     */
    public static void Play() {
        ArrayHelper arrayHelper = new ArrayHelper();
        arrayHelper.printShortArr();                                // print short array that is within ArrayHelper

        System.out.println("\nnow print copy of booty arr");
        //int[] newArr = new int[arrayHelper.getShortArrSize()];
        int[] newArr = new int[19];                                 // declare a new array
        newArr = arrayHelper.initArray(newArr);                     // initialize the array
        ArrayHelper.printArr(newArr);                               // print the array
    }

    // initializes and traverses a simple 2D array
    public static void simple2DArr() {
        int[][] twoDArr = new int[][] {
                new int[] {1, 2, 3},
                new int[] {4, 5, 6},
                new int[] {7, 8, 9},
                new int[] {10, 11, 12}
        };

        System.out.println("twoDArr.length: " + twoDArr.length);                    // Display number of rows
        for (int i = 0; i < twoDArr.length; i++) {
            System.out.println("twoDArr[i].length: " + twoDArr[i].length);          // Display number of columns
            for (int j = 0; j < twoDArr[i].length; j++) {
                System.out.println("twoDArr[" + i + "][" + j + "]: " + twoDArr[i][j]);
            }
        }
    }
}
