public class InsertionSort {
    public static void main(String args[]) {
        int arr[] = { 9, 2, 1, 7, 8 };

        for (int i = 1; i < arr.length; i++) {
            int element = arr[i]; // Current element to be inserted
            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the element at its correct position
            arr[j + 1] = element;
        }

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
