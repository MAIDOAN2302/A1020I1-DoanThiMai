package _15_exception.bai_tap;

public class Check extends Exception {
    public Check (){
        super("Loi");
    }
    public Check (String msg){
        super(msg);
    }

}

