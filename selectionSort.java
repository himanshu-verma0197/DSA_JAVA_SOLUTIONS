public class selectionSort {
    // function to print array
    void printArray(int arr[]) {
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 11, 9, 15, 2, 20 };

        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // assume the current index has the smallest value
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // update minIndex
                }
            }
            // swap arr[i] with arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // create object and print array
        selectionSort S = new selectionSort();
        S.printArray(arr);
    }
}
