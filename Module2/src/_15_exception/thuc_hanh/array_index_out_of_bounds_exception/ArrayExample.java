package _15_exception.thuc_hanh.array_index_out_of_bounds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public static Integer[] createRandom() {
        Random random = new Random();
        Integer[] array = new Integer[5];
        System.out.println("Danh sach phan tu cua mang : ");
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(5);
            System.out.print(array[i] + " , " );
        }
        return array;
    }
}
