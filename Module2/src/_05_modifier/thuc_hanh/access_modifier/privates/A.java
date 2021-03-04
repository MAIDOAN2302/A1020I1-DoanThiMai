package _05_modifier.thuc_hanh.access_modifier.privates;

public class A {
    private int data = 40;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    static void mgs(){
        System.out.println("Hello Java");
    }
}

