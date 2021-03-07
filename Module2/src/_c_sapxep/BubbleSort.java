package _c_sapxep;

public class BubbleSort {
    public static void main(String[] args) {
        int [] numbers = {1,2,56,7,6,3,8,96,2,8,6,5};

        bubbleSort(numbers);
        printArray(numbers);


    }
    public static int[] bubbleSort(int[] A){
        for (int i = 0; i < A.length-1; i++){
             for (int j = 0; j < A.length - 1 - i; j++){
                 if (A[j] > A[j + 1]){
                     int temp = A[j + 1];
                     A[j + 1] = A[j];
                     A[j] = temp;
                 }
             }
        }
        return A;
    }
    public static void printArray(int[] A){
        for (int i = 0; i < A.length; i++){
            System.out.print(A[i] + ",");
        }
    }
}
// Do phuc tap cua thuat toan
// T(n) = O(n^2)
