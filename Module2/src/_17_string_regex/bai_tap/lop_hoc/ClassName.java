package _17_string_regex.bai_tap.lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static  final  String className = "^[CAP]*[\\d]{4,}[GHIKLM]$";

    public ClassName(){
    }

    public  boolean validate(String regex){
        Pattern pattern = Pattern.compile(className);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
