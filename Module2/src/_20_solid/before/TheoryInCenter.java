package _20_solid.before;

public class TheoryInCenter {
    public static void main(String[] args) {
        Student student = new Student(1, "Nguyen Van A", "18-11-2020");

        if (student.readBeforeJoinTheory()) {
            System.out.println("Giang vien co the day ly thuyet va hoc vien co the nam bat duoc!");
        } else {
            System.out.println("Chiu :(");
        }
    }
}
