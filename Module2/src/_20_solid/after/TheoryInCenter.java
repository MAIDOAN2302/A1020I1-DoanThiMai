package _20_solid.after;

public class TheoryInCenter {
    public static void main(String[] args) {
        StudentAbc student = new StudentAbc(1, "Nguyen Van A", "18-11-2020");

        if (student.readBeforeJoinTheory()) {
            System.out.println("Giang vien co the day ly thuyet va hoc vien co the nam bat duoc!");
        } else {
            System.out.println("Chiu :(");
        }
    }
}
