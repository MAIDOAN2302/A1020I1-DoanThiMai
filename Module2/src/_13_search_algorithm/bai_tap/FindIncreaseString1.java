package _13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindIncreaseString1 {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string : ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (list.size() == 0 || string.charAt(i) < list.getLast()) {
                list.clear();
            }
            list.add(string.charAt(i));

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character ch : max)
            System.out.print(ch);

    }
}
/*Phan tich do phuc tap cua thuat toan
T(n) = O(n)
 */
