package _17_string_regex.bai_tap.dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static final String phoneNumber = "^[(][\\d]{2,}[)](-)[(](0)[\\d]{9,}[)]";

    public PhoneNumber() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(phoneNumber);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
