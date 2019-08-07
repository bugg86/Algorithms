public class SortArray {
    public static void main(String[] args) {
        int[] arr = {3,9,1,7,5,4,3,8,4};
        System.out.print("Starting array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        printArray(bubbleSort(arr));
    }
    private static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    printArray(arr);
                }
            }
        }
        return arr;
    }
}
