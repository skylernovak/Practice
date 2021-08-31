import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = { 9, 28, 19, 44, 24 };
        for (int num : arr)
            System.out.print(num + " ");

        Arrays.sort(arr);
        System.out.println("\r\nSorted...");

        for (int num : arr)
            System.out.print(num + " ");
    }
}
