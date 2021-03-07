package _c_sapxep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SapXepCacPhanTuTrongList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Mai");
        stringList.add("Thanh");
        stringList.add("Hoa");
        stringList.add("Vi");
        stringList.add("Phi");

        for (String list : stringList) {
            System.out.println("Danh sach : ");
            System.out.println(list);
        }
        System.out.println("Danh sach sau khi sap xep: ");
        Collections.sort(stringList);
        for (String list1 : stringList) {
            System.out.println(list1);
        }
        List<Integer> integerList = new ArrayList<>();
        integerList.add(25);
        integerList.add(56);
        integerList.add(70);
        integerList.add(12);
        integerList.add(0);
        integerList.add(8);

        for (Integer integer : integerList) {
            System.out.println(integer);
        }

        System.out.println("Danh sach sau khi sap xep: ");
        Collections.sort(integerList);
        for (Integer integer1 : integerList) {
            System.out.println(integer1);
        }
    }
}
