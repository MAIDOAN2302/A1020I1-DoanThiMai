package _12_java_collection_framework.thuc_hanh.comparator_and_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Hung", 15, "HN");
        Student student1 = new Student("Hoa", 22, "BD");
        Student student2 = new Student("Dung", 52, "HCM");
        Student student3 = new Student("Tra", 32, "DN");
        Student student4 = new Student("Thanh", 26, "QN");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        Collections.sort(studentList);
        for (Student students : studentList) {
            System.out.println(students.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);
        System.out.println("Sort age: ");
        for (Student ages : studentList) {
            System.out.println(ages.toString());
        }

    }
}

