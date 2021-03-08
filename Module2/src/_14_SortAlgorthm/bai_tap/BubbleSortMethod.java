package _14_SortAlgorthm.bai_tap;

import java.util.Arrays;

public class BubbleSortMethod {
    public static void main(String[] args) {
        int [] arr = {1,5,9,63,7,3,4};

        for (int i = 1; i < arr.length; i++){
            for (int j = 0;j < arr.length - i; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
