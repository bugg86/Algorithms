public class QuickSort {
    //Main method
    public static void main(String[] args) {
        //Create array to be sorted
        int[] array = {3, 7, 8, 5, 2, 1, 9, 5, 4};
        quickSort(array, 0, 8);
    }
    public static int partition(int[] array, int lo, int hi) {
        //Declare the pivot value
        int pivot = array[hi];

        //Declare the temp variable used for swapping
        int temp = 0;

        //Declare the index of the smaller value
        int i = lo - 1;

        //Traverse through the partition
        for(int j = lo; j <= hi - 1; j++) {
            //Check if the current value is less than or equal to the pivot value
            if(array[j] <= pivot ) {
                //Increment the smaller index
                i++;

                //Swap the variables
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        temp = array[i + 1];
        array[i + 1] = array[hi];
        array[hi] = temp;
        return i + 1;
    }

    public static void quickSort(int[] array, int lo, int hi) {
        //Print out the array at each step.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Stop the alogrithm from going forever
        if (lo >= hi) {
            return;
        }

        if (lo < hi) {
            //Find the index
            int index = partition(array, lo, hi);

            //Sort each side of the index
            quickSort(array, lo, index - 1);
            quickSort(array, index + 1, hi);
        }
    }
}
