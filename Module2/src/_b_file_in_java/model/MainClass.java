package _b_file_in_java.model;

import _b_file_in_java.common.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    // file csv la file co dang dac biet: cac thuoc tinh cach nhau boi day comma.
    public static final String FILE_NAME = "src/_b_file_in_java/model/student.csv";
    public static final String COMMA = ",";

    public static void main(String[] args) {

        // output file
        Student student1 = new Student(1,"Nguyen Van A","23/02/1998");
        Student student2 = new Student(2,"Nguyen Van B","24/03/1999");
        Student student3 = new Student(3,"Nguyen Van C","25/04/1997");

        // Chua cac hoc vien trong 1 list
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        // tao line de viet vao trong file
        String line = null;
        for (Student student: studentList){
            line = student.getId() + COMMA + student.getName() + COMMA + student.getDateOfBirth();
            // tien hanh ghi vao file
            FileUtils.writeFile(FILE_NAME,line);
        }

        //Input File

        List<String> listLine = FileUtils.readFile(FILE_NAME);
        System.out.println(listLine);
    }
}
