package _17_string_regex.bai_tap.dien_thoai;

import java.util.Scanner;

public class PhoneNumberTest {
    public static PhoneNumber phoneNumber;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone number you want test :");
        String phoneNumber1 = scanner.nextLine();

        phoneNumber = new PhoneNumber();
        boolean isValid = phoneNumber.validate(phoneNumber1);
        System.out.println("Phone number is : " + phoneNumber1 + " is valid " +isValid);

    }
}
