/*
This class will sort an array using the Bubble Sort algorithm.
 */

public class SortArray {
    public static void main(String[] args) {
        //Declare and initialize the test array. Can be replaced with user input.
        int[] arr = {3,9,1,7,5,4,3,8,4};

        //Print out the starting array.
        System.out.print("Starting array: ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Call the method that sorts the array.
        bubbleSort(arr);
    }
    //Method that prints an array
    private static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    //Method that sorts an array
    private static void bubbleSort(int[] arr) {
        //Loops until the whole array has been processed
        for (int i = 0; i < arr.length - 1; i++) {
            //Loops through all unsorted items
            for(int j = 0; j < arr.length - i - 1; j++) {
                //Checks if the items need to be swapped
                if(arr[j] > arr[j + 1]) {
                    //Swaps the items
                    int temp = 0;
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    //Prints the current array
                    printArray(arr);
                }
            }
        }
    }
}
