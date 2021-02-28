package _11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static void main(String[] args) {
        Stack<Character> bStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Expression want check : ");
        String sym = scanner.nextLine();
        String left = "";
        boolean flag = true;

        for (int i = 0; i < sym.length(); i++) {
            if (sym.charAt(i) == '(') {
                bStack.push(sym.charAt(i));
            } else if (sym.charAt(i) == ')') {
                if (bStack.isEmpty()) {
                    System.out.println("False");
                    flag = false;
                } else {
                    left = left + bStack.pop();
                }
            }
        }
        if (bStack.isEmpty() && flag){
            System.out.println("Bieu thuc Ok");
        }else {
            System.out.println("Bieu thuc NG");
        }
    }
}

