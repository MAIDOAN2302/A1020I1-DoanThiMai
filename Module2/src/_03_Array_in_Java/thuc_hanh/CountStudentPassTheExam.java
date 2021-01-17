package _03_Array_in_Java.thuc_hanh;

import java.util.Scanner;

public class CountStudentPassTheExam {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input size of array");
             size = sc.nextInt();
            if (size > 30){
                System.out.println("Size should not exceed 30");
            }
        }while (size > 30);
        int[]  arr = new int[size];
        int i = 0;
        while (i < arr.length){
            System.out.println("Enter a mark for student " + (i+1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("list of mark: ");
        for (int j = 0; j < arr.length; j++){
            System.out.println(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10){
                count++;
            }
        }
        System.out.println("\n The number of student passing the exam is : " + count);
    }
}
