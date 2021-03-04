package _07_abstraction.thuc_hanh.comparetor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input length of array : ");
        int n = scanner.nextInt();

        Square[] squares = new Square[n];

        System.out.println("Input side of array square : ");
       for (int i = 0; i < squares.length; i++){
           double side = scanner.nextDouble();
           squares[i] = new Square(side);
       }
        System.out.println("Before - sort : ");
        for (Square square:squares
             ) {
            System.out.println(square);
        }

        Comparator square = new SquareComparator();
        Arrays.sort(squares,square);

        System.out.println("After - sorted : ");
        for (Square square1: squares
             ) {
            System.out.println(square1);

        }
    }
}
