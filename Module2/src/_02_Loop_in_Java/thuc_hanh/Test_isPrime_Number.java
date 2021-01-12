package _02_Loop_in_Java.thuc_hanh;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Test_isPrime_Number {
    static boolean isPrimeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas input n: ");
        int n = scanner.nextInt();
        int count = 0;
        int i = 1;
        while (true){
            if (isPrimeNumber(i)){
                System.out.println(i);
                count++;
            }
            if (count == n){
                break;
            }
            i++;
        }
    }
}
