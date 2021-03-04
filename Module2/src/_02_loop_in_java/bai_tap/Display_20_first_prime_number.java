package _02_loop_in_java.bai_tap;

public class Display_20_first_prime_number {
    static boolean isPrimeNumber(int number){
        int count = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                count++;
            }
        }
        if (count == 2){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 20;
        int i = 1;
        int count = 0;
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
