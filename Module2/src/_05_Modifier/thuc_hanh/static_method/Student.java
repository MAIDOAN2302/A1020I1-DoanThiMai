package _05_Modifier.thuc_hanh.static_method;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDTT";


    Student (int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
