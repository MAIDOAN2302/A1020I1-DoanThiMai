package _14_SortAlgorthm.bai_tap;

import java.util.Arrays;

public class InsertionSortMethod {
    public static void main(String[] args) {
        int[] array = {1, 5, 8, 9, 5, 6};

        for (int i = 1; i < array.length; i++){
            for (int j = 0; j < array.length - i; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
