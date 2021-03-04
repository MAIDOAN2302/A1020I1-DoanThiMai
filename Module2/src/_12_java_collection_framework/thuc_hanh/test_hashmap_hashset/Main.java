package _12_java_collection_framework.thuc_hanh.test_hashmap_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Mai", 29, "QN");
        Student student2 = new Student("Anh", 22, "DN");
        Student student3 = new Student("Vi", 18, "HN");

        System.out.println("Display list using hash map: ");
        Map<Integer, Student> hashmap = new HashMap<>();
        hashmap.put(1, student1);
        hashmap.put(2, student2);
        hashmap.put(3, student3);
        hashmap.put(4, student1);

//        for(Map.Entry<Integer, Student> student : hashmap.entrySet()){
//            System.out.println(student.toString());
//        }
        Set<Integer> keys = hashmap.keySet();
        for (Integer key : keys) {
            System.out.print(key + " : ");
            System.out.println(hashmap.get(key));
        }
//        System.out.println(hashmap);


        System.out.println("Display list using hash set : ");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student2);

        for (Student studentA: students) {
            System.out.println(studentA.toString());
        }
    }

}
