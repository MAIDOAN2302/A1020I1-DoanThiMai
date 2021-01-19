package _05_Modifier.thuc_hanh.access_modifier.defaults.mypack;

import _05_Modifier.thuc_hanh.access_modifier.defaults.pack.A;

public class B {
    public static void main(String[] args) {
        A obj = new A();
        //obj.msg();   // error
    }

}
