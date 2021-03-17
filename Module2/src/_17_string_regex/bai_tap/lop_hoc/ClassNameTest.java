package _17_string_regex.bai_tap.lop_hoc;

import _17_string_regex.thuc_hanh.validate_account.AccountExample;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import java.util.Scanner;

public class ClassNameTest {
    public static ClassName className;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input class name you want test: ");
        String className1 = sc.nextLine();

        className = new ClassName();
        boolean isValid = className.validate(className1);
        System.out.println("Class name is : " + className1 + " is valid " +isValid);
    }

}


