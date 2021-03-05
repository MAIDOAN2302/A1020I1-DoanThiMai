package _13_search_algorithm.bai_tap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class FindIncreaseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String you want find increase String : ");
        String string = scanner.nextLine();

        LinkedList<Character> stringWantFind = new LinkedList<>();

       for (int i = 0; i < string.length(); i++){
           LinkedList<Character> list = new LinkedList<>();
           list.add(string.charAt(i));
           for (int j = i + 1; j < string.length(); j++){
               if (string.charAt(j) > list.getLast()){
                   list.add(string.charAt(j));
               }
           }
           if (list.size() > stringWantFind.size()){
               stringWantFind.clear();
               stringWantFind.addAll(list);
           }
           list.clear();
        }
       LinkedList<Character> strings = new LinkedList<>();
       for (Character ch : stringWantFind){
           strings.add(ch);
       }
        System.out.println(strings);
    }
}
/* Phan tich su phuc tam
1. dong 15 + 18  vong lap long nhau  = O(n^2)
2. dong 17 phep gan 1 = O(1)
3. dong 19 if = O(1)
4. dong 23 if = O(1)
5. dong 27 add = O(1)
6. dong 30 vong lap for = O(n)

T(n) = O(n^2) + O(1) +  O(1) + O(1) + O(1) + O(n) = O(n) + O(n^2) = O(n^2)
 */
