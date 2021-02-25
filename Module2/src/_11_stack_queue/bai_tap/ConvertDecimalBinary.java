package _11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalBinary {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input decimal number: ");

        int decimalNumber = scanner.nextInt();

        while (decimalNumber!=0){
            int binaryNumber = decimalNumber%2;
            integerStack.push(binaryNumber);
            decimalNumber = decimalNumber/2;
        }
        System.out.print("Print binary number = " );

        while (!integerStack.isEmpty()){
            System.out.print(integerStack.pop());
        }
    }
}
