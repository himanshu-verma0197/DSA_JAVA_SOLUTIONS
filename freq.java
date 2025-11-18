class Freq {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3, 1, 4, 4, 4, 5, 6, 6, 6, 7 };

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted)
                continue;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + "  " + count);
        }
    }
}
