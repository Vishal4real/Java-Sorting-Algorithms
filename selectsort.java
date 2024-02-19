import java.util.Arrays;

public class selectsort {
    public static void main(String[] args) {
        int arr[] = { 10, 12, 9, 8, 15,56,2};
        sortbyselect(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortbyselect(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMin(arr, i);
            swapFun(arr, i, minIndex);
        }
    }

    static int findMin(int[] arr, int first) {
        int min = first;
        for (int i = first+1; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }

    static void swapFun(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
