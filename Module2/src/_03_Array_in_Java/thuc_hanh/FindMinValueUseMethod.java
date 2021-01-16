package _03_Array_in_Java.thuc_hanh;

public class FindMinValueUseMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 63, 4, 8};
        System.out.println("Min is: " + min(arr));

    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
