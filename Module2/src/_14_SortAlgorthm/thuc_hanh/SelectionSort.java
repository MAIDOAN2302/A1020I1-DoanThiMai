package _14_SortAlgorthm.thuc_hanh;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1,5,6,9,8,2};

        for (int i = 0; i < arr.length - 1; i++){
            int iMin = i;
            for (int j = i; j < arr.length; j ++){
                if (arr[j] < arr[iMin]){
                    iMin = j;
                }
            }
            if (iMin != i){
                int tmp = arr[i];
                arr[i] = arr[iMin];
                arr[iMin] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
