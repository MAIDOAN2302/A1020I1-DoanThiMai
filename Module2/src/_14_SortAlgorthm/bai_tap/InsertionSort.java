package _14_SortAlgorthm.bai_tap;

import com.sun.corba.se.spi.monitoring.MonitoredAttributeInfo;

public class InsertionSort {
    public static void main(String[] args) {
        int [] a = {1,8,6,5,3};
        System.out.println("Display list: ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + ",");
        }
        insertion(a);
    }

    public static void insertion(int[] a){

        boolean needNextPass = true;

        for (int i = 1; i < a.length; i++){
            needNextPass = false;
            for (int j = 0; j < a.length -i; j++){
                if (a[j] > a[j + 1]){
                    System.out.println("Swap " + a[j] + " with " + a[j + 1]);
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;

                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("List after the  " + i + "' sort: ");
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j] + "\t");
            }
            System.out.println();
        }
    }
}
