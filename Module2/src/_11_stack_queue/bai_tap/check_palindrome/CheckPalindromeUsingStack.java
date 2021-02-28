package _11_stack_queue.bai_tap.check_palindrome;

import java.util.Scanner;
import java.util.Stack;

public class CheckPalindromeUsingStack {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any String : ");
        String str = scanner.nextLine();

        for (int i = 0; i < str.length(); i++){
            st.push(str.charAt(i));
        }
        String reverseString = "";
        while (!st.isEmpty()){
            reverseString =reverseString+ st.pop();
        }
        System.out.println(reverseString);
        if (reverseString.equals(str)){
            System.out.println("The String is a palindrome");
        }else {
            System.out.println("The String is not a palindrome");
        }
    }
}
