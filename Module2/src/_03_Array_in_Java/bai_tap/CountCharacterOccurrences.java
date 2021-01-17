package _03_Array_in_Java.bai_tap;

import java.util.Scanner;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String string = sc.nextLine();
        System.out.println("Enter character you want to count: ");
        char ch = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (ch == string.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
