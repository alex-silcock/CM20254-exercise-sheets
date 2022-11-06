public class MergeSort {

    void sort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {5, 9, 3, 1, 7};
        MergeSort ms = new MergeSort();
        ms.sort(a);
        printArray(a);
    }
}
