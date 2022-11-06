public class SelectionSort {

    void sort (int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 9, 1, 3, 14, 2, 189};
        SelectionSort ss = new SelectionSort();
        ss.sort(arr);
        ss.printArray(arr);
    }
}
