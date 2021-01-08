package _01_Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Tinh_so_ngay_trong_thang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap thang ban can tim");
        int month = scanner.nextInt();

        switch (month){
            case 2:
                System.out.println("Thang hai co 28 or 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month +" " +"co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + month + " "+ "co 30 ngay");
                break;
            default:
                System.out.println("Thang " + month + " ");
                break;
        }
        String daysInMonth;
        switch (month){
            case 2:
                daysInMonth = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = " ";
        }
        if (daysInMonth != " ") System.out.printf("thang %d co %s!",month,daysInMonth);
        else System.out.println("Input khong hop le");
    }
}
