class SelectionSort {
    public static void main(String[] args) {
        SelectionSort so = new SelectionSort();
        int[] arr = {88, 14, 28, 41, 9, 144, 12, 64};
        so.printArr(arr);
        so.sortArr(arr);
        so.printArr(arr);
    }

    public void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    public void sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_inx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_inx])
                    min_inx = j;
            }

            // swap
            int temp = arr[min_inx];
            arr[min_inx] = arr[i];
            arr[i] = temp;
        }
    }
}