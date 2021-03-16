package _00_bai_tap_them._00_bai_tap_quan_ly_san_pham;

public class DIENTHOAI extends SANPHAM {
    public DIENTHOAI(String msp, String tesp, float soluong, float dongia) {
        super(msp, tesp, soluong, dongia);
    }

    @Override
    float tinhtien() {
        float tt = (float) (getDongia() * getSoluong() * (1 -0.2));
        return tt;
    }
}
