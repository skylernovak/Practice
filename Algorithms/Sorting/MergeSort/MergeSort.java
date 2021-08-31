/**
 * Example from HackerRank & Gayle McDowell
 * https://www.youtube.com/watch?v=KF2j-9iSf4Q
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] array = { 7, 35, 41, 9, 59, 81, 93, 49, 28, 24, 8, 21, 89, 36, 12, 40, 57, 34, 98, 50, 11, 39, 29, 40,
                10 };

        System.out.print("Unsorted Array: ");
        for (int i : array)
            System.out.print(i + " ");
        mergeSort(array);
        System.out.print("\n\rSorted Array: ");
        for (int i : array)
            System.out.print(i + " ");
    }

    public static void mergeSort(int[] arr) {
        mergeSort(arr, new int[arr.length], 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left >= right)
            return;
        int middle = (left + right) / 2;
        mergeSort(arr, temp, left, middle);
        mergeSort(arr, temp, middle + 1, right);
        mergeHalves(arr, temp, left, right);
    }

    public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1; // !!! forgot +1, caused error !!!

        int leftIndex = leftStart;
        int rightIndex = rightStart;
        int index = leftStart;

        while (leftIndex <= leftEnd && rightIndex <= rightEnd) {
            if (arr[leftIndex] < arr[rightIndex]) {
                temp[index] = arr[leftIndex];
                leftIndex++;
            } else {
                temp[index] = arr[rightIndex];
                rightIndex++;
            }
            index++;
        }

        if (leftIndex > leftEnd) {
            while (rightIndex <= rightEnd) {
                temp[index] = arr[rightIndex];
                rightIndex++;
                index++;
            }
        } else {
            while (leftIndex <= leftEnd) {
                temp[index] = arr[leftIndex];
                leftIndex++;
                index++;
            }
        }

        System.arraycopy(temp, leftStart, arr, leftStart, size);
    }
}
