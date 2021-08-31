/*
01/03/21
Write a program to sum an array
*/

class ex1 {

    private static final int ARR_SIZE = 5;

    public static void main (String[] args) {
        int[] arr = new int[ARR_SIZE];
        int sum = 0;

        System.out.println("Initilizing array...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }

        System.out.println("The array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array[" + i + "]: " + arr[i]);
        }

        System.out.println("Summing array");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("The sum is: " + sum);
    }
}