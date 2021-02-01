package _07_Abstraction.thuc_hanh.comparetor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Input length of array : ");
        int n = sc.nextInt();
         Rectangle[] rectangles = new Rectangle[n];

        System.out.println("Input element of array : ");

        for (int i = 0; i < rectangles.length; i++){
            double width = sc.nextDouble();
            double height = sc.nextDouble();
            rectangles[i] = new Rectangle(width, height);
        }
//        rectangles[0] = new Rectangle(6,3);
//        rectangles[1] = new Rectangle();
//        rectangles[2] = new Rectangle("White",7,9);

        System.out.println("Before - sort : ");
        for (Rectangle rectangle: rectangles
             ) {
            System.out.println(rectangle);

        }

        Comparator rectangleComparator = new RectangleComparator();
        Arrays.sort(rectangles,rectangleComparator);

        System.out.println("After - sorted : ");
        for (Rectangle rectangle: rectangles
             ) {
            System.out.println(rectangle);

        }

    }
}
