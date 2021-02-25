package _11_stack_queue.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseElementOfArrayUseStack {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        int[] myArray = {1, 5, 6, 8, 7};

        int size = myArray.length;

        for (int i = 0; i < size; i++) {
            integerStack.push(myArray[i]);
        }

        System.out.println(integerStack);

        for (int i = 0; i < size; i++) {
            if (!integerStack.isEmpty()) {
                myArray[i] = integerStack.pop();
            }
        }
        System.out.println(Arrays.toString(myArray));
        // Tack 2

        //Stack <Character> wStack = new Stack<>();
        Stack <String> wStack = new Stack<>();
        String mWord = "Hello world";
       // char [] arr = new char[mWord.length()];
        String[] arr1 = mWord.split(" ");

        for (int i = 0; i < arr1.length; i++){
            wStack.push(arr1[i]);
        }
        for (int i = 0; i < arr1.length; i++){
            if (!wStack.isEmpty()){
                System.out.print(wStack.pop()+ " ");
            }
        }


//        for (int i = 0; i <mWord.length(); i++){
//            char ch = mWord.charAt(i);
//            arr[i] = ch;
//        }

//        for (int i = 0; i < arr.length; i++){
//            wStack.push(arr[i]);
////        }
//        System.out.println(wStack);
//
//        for (int i = 0; i < mWord.length(); i++){
//            if (!wStack.isEmpty()){
//                System.out.print(wStack.pop());
            }
        }



