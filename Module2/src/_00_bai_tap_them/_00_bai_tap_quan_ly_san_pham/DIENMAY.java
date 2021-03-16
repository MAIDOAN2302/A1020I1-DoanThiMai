package _00_bai_tap_them._00_bai_tap_quan_ly_san_pham;

public class DIENMAY extends SANPHAM{
    public DIENMAY(String msp, String tesp, float soluong, float dongia) {
        super(msp, tesp, soluong, dongia);
    }

    @Override
    float tinhtien() {
        float tt = (float) (getDongia() * getSoluong() * (1 - 0.1));
        return tt;
    }
}
