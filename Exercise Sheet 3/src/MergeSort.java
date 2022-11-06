public class MergeSort {

    public void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        if (n - mid >= 0) System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] n, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                n[k++] = l[i++];
            }
            else {
                n[k++] = r[j++];
            }
        }
        while (i < left) {
            n[k++] = l[i++];
        }
        while (j < right) {
            n[k++] = r[j++];
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
        ms.mergeSort(a, a.length);
        printArray(a);
    }
}
