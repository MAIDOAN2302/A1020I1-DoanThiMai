package _11_stack_queue.bai_tap.demerging;

public class Person {
String name;
String gender;
String birthday;

    public Person() {

    }

    public Person(String name, String gender, String birthday) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return
                "Ten ='" + name + '\'' +
                ", Gioi tinh ='" + gender + '\'' +
                ", Ngay sinh ='" + birthday + '\'';
    }
}
