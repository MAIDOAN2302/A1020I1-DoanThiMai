package _01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Tinh_BMI_co_the {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;

        System.out.println("Enter is a weight");
        weight = scanner.nextFloat();

        System.out.println("Enter is a height");
        height = scanner.nextFloat();

        double BMI = weight/Math.pow(height,2);
        if (BMI < 18.5){
            System.out.println("Chi so co the dat muc : Underweight");
        }else if (BMI < 25.0){
            System.out.println("Chi so co the dat muc : Normal" );
        }else if (BMI < 30.0){
            System.out.println("Chi so co the dat muc: Overweight");
        }else if (BMI > 30){
            System.out.println("Chi so co the dat muc: Obese");
        }
    }
}
